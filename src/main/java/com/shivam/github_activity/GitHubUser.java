package com.shivam.github_activity;

/**
 * Represents a GitHub user profile with basic information.
 */
public class GitHubUser {
    /** Username (login) */
    private String login;
    /** Display name */
    private String name;
    /** User bio */
    private String bio;
    /** User location */
    private String location;
    /** Number of public repositories */
    private int public_repos;
    /** Number of followers */
    private int followers;
    /** Number of following */
    private int following;

    /**
     * Constructs a GitHubUser with all fields.
     */
    public GitHubUser(String login, String name, String bio, String location, int public_repos, int followers, int following) {
        this.login = login;
        this.name = name;
        this.bio = bio;
        this.location = location;
        this.public_repos = public_repos;
        this.followers = followers;
        this.following = following;
    }

    /** Gets the username (login). */
    public String getLogin() {
        return login;
    }
    /** Sets the username (login). */
    public void setLogin(String login) {
        this.login = login;
    }
    /** Gets the display name. */
    public String getName() {
        return name;
    }
    /** Sets the display name. */
    public void setName(String name) {
        this.name = name;
    }
    /** Gets the user bio. */
    public String getBio() {
        return bio;
    }
    /** Sets the user bio. */
    public void setBio(String bio) {
        this.bio = bio;
    }
    /** Gets the user location. */
    public String getLocation() {
        return location;
    }
    /** Sets the user location. */
    public void setLocation(String location) {
        this.location = location;
    }
    /** Gets the number of public repositories. */
    public int getPublic_repos() {
        return public_repos;
    }
    /** Sets the number of public repositories. */
    public void setPublic_repos(int public_repos) {
        this.public_repos = public_repos;
    }
    /** Gets the number of followers. */
    public int getFollowers() {
        return followers;
    }
    /** Sets the number of followers. */
    public void setFollowers(int followers) {
        this.followers = followers;
    }
    /** Gets the number of following. */
    public int getFollowing() {
        return following;
    }
    /** Sets the number of following. */
    public void setFollowing(int following) {
        this.following = following;
    }
}
