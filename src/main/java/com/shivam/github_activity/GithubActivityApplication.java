package com.shivam.github_activity;

import java.util.Scanner;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Main Spring Boot application for fetching and displaying GitHub user activity.
 *
 * Prompts for a GitHub username, fetches user profile, recent commits, and repositories using GitHub API.
 */
@SpringBootApplication
public class GithubActivityApplication implements CommandLineRunner{

    /**
     * Application entry point.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(GithubActivityApplication.class, args);
    }

    /**
     * Runs after the application context is loaded. Handles user input and API calls.
     * @param args command-line arguments
     */
    @Override
    public void run(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Github Username");
        String userName = sc.nextLine();

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.github.com/users/" + userName;

        try {
            // Fetch user profile
            GitHubUser user = restTemplate.getForObject(url, GitHubUser.class);

            System.out.println("\n--- Github User Profile ---");
            System.out.println("Name      : " + user.getName());
            System.out.println("Bio       : " + user.getBio());
            System.out.println("Location  : " + user.getLocation());
            System.out.println("Repos     : " + user.getPublic_repos());
            System.out.println("Followers : " + user.getFollowers());
            System.out.println("Following : " + user.getFollowing());

        } catch (Exception e) {
            System.out.println("\u274c Failed to fetch user data. " + e.getMessage());
        }

        String eventsUrl = "https://api.github.com/users/" + userName + "/events/public";

        try {
            // Fetch recent public events (commits)
            ResponseEntity<GitHubEvent[]> response = restTemplate.getForEntity(eventsUrl, GitHubEvent[].class);
            GitHubEvent[] events = response.getBody();

            System.out.println("\n--- Recent Commits ---");
            int commitCount = 0;

            for (GitHubEvent event : events) {
                // Only consider PushEvent types
                if ("PushEvent".equals(event.getType()) && event.getPayload() != null) {
                    List<GitHubEvent.Payload.Commit> commits = event.getPayload().getCommits();

                    if (commits != null) {
                        for (GitHubEvent.Payload.Commit commit : commits) {
                            if (commitCount >= 5) {
                                break;
                            }
                            // Print commit message and repo name
                            System.out.println("[" + event.getRepo().getName() +"] " + commit.getMessage());
                            commitCount++;
                        }
                    }
                }
                if (commitCount >= 5) break;
            }
        } catch (Exception e) {
            System.out.println("\u274c Failed to fetch user activity. " + e.getMessage());
        }

        String reposUrl = "https://api.github.com/users/" + userName + "/repos";

        try {
            // Fetch public repositories
            ResponseEntity<GitHubRepo[]> repoResponse = restTemplate.getForEntity(reposUrl, GitHubRepo[].class);
            GitHubRepo[] repos = repoResponse.getBody();

            System.out.println("\n--- Public Repositories ---");
            for (int i = 0; i < Math.min(5, repos.length); i++) {
                GitHubRepo repo = repos[i];
                System.out.println("[" + repo.getName() + "] \u2b50 " + repo.getStargazers_count() + " | \ud83c\udf74 " + repo.getForks_count());
                System.out.println("URL: " + repo.getHtml_url());
                System.out.println("Desc: " + repo.getDescription());
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("\u274c Failed to fetch repositories. " + e.getMessage());
        }
        sc.close();
    }
}
