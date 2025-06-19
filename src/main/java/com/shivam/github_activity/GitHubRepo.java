package com.shivam.github_activity;

public class GitHubRepo {
    private String name;
    private String html_url;
    private String description;
    private int stargazers_count;
    private int forks_count;

    public GitHubRepo() {
    }

    public GitHubRepo(String name, String html_url, String description, int stargazers_count, int forks_count) {
        this.name = name;
        this.html_url = html_url;
        this.description = description;
        this.stargazers_count = stargazers_count;
        this.forks_count = forks_count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStargazers_count() {
        return stargazers_count;
    }

    public void setStargazers_count(int stargazers_count) {
        this.stargazers_count = stargazers_count;
    }

    public int getForks_count() {
        return forks_count;
    }

    public void setForks_count(int forks_count) {
        this.forks_count = forks_count;
    }
}
