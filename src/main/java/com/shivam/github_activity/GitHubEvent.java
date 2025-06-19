package com.shivam.github_activity;

public class GitHubEvent {
    private String type;
    private String created_at;

    public GitHubEvent() {
    }

    public GitHubEvent(String type, String created_at) {
        this.type = type;
        this.created_at = created_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
