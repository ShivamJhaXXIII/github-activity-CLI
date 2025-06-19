package com.shivam.github_activity;

public class GitHubUser {
    private String login;
    private String name;
    private String bio;
    private String location;
    private int public_repos;
    private int followers;
    private int following;

    public GitHubUser(String login, String name, String bio, String location, int public_repos, int followers, int following) {
        this.login = login;
        this.name = name;
        this.bio = bio;
        this.location = location;
        this.public_repos = public_repos;
        this.followers = followers;
        this.following = following;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(int public_repos) {
        this.public_repos = public_repos;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }
}
