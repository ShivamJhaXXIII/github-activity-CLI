package com.shivam.github_activity;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GithubActivityApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(GithubActivityApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Github Username");
		String userName = sc.nextLine();

		RestTemplate restTemplate = new RestTemplate();
		String url = "https://api.github.com/users/" + userName;

		try {
			GitHubUser user = restTemplate.getForObject(url, GitHubUser.class);

			System.out.println("\n--- Github User Profile ---");

			System.out.println("Name      : " + user.getName());
			System.out.println("Bio       : " + user.getBio());
			System.out.println("Location  : " + user.getLocation());
			System.out.println("Repos     : " + user.getPublic_repos());
			System.out.println("Followers : " + user.getFollowers());
			System.out.println("Following : " + user.getFollowing());

		} catch (Exception e) {
			System.out.println("❌ Failed to fetch user data. " + e.getMessage());
		}

		String eventsUrl = "https://api.github.com/users/" + userName + "/events/public";

		try {
			ResponseEntity<GitHubEvent[]> response = restTemplate.getForEntity(eventsUrl, GitHubEvent[].class);
			GitHubEvent[] events = response.getBody();

			System.out.println("\n--- Recent Public Activity ---");

			for (int i = 0; i < Math.min(5, events.length); i++) {
				System.out.println("Type: " + events[i].getType() + " | Date: " +events[i].getCreated_at());
			}
		} catch (Exception e) {
			System.out.println("❌ Failed to fetch user activity. " + e.getMessage());
		}
		sc.close();
	}

}
