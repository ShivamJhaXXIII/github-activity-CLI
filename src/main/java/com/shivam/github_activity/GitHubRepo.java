package com.shivam.github_activity;

/**
 * Represents a GitHub repository with basic information.
 */
public class GitHubRepo {
    /** Repository name */
    private String name;
    /** Repository URL */
    private String html_url;
    /** Repository description */
    private String description;
    /** Number of stargazers */
    private int stargazers_count;
    /** Number of forks */
    private int forks_count;

    /** Default constructor */
    public GitHubRepo() {
    }

    /**
     * Constructs a GitHubRepo with all fields.
     */
    public GitHubRepo(String name, String html_url, String description, int stargazers_count, int forks_count) {
        this.name = name;
        this.html_url = html_url;
        this.description = description;
        this.stargazers_count = stargazers_count;
        this.forks_count = forks_count;
    }

    /** Gets the repository name. */
    public String getName() {
        return name;
    }
    /** Sets the repository name. */
    public void setName(String name) {
        this.name = name;
    }
    /** Gets the repository URL. */
    public String getHtml_url() {
        return html_url;
    }
    /** Sets the repository URL. */
    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }
    /** Gets the repository description. */
    public String getDescription() {
        return description;
    }
    /** Sets the repository description. */
    public void setDescription(String description) {
        this.description = description;
    }
    /** Gets the stargazers count. */
    public int getStargazers_count() {
        return stargazers_count;
    }
    /** Sets the stargazers count. */
    public void setStargazers_count(int stargazers_count) {
        this.stargazers_count = stargazers_count;
    }
    /** Gets the forks count. */
    public int getForks_count() {
        return forks_count;
    }
    /** Sets the forks count. */
    public void setForks_count(int forks_count) {
        this.forks_count = forks_count;
    }
}
