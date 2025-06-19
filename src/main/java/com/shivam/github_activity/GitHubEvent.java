package com.shivam.github_activity;

import java.util.List;

public class GitHubEvent {
    private String type;
    private String created_at;
    private Repo repo;
    private Payload payload;

    public static class Repo {
        private String name;
        public void setName(String name) {
           this.name = name;
        }
        public String getName() {
            return this.name;
        }
    }

    public static class Payload {
        private List<Commit> commits;

        public List<Commit> getCommits() {
            return commits;
        }

        public void setCommits(List<Commit> commits) {
            this.commits = commits;
        }

        public static class Commit {
        private String message;
        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
    }

    

    public GitHubEvent() {
    }

    public GitHubEvent(String type, String created_at, Repo repo, Payload payload) {
        this.type = type;
        this.created_at = created_at;
        this.repo = repo;
        this.payload = payload;
    }

    public Repo getRepo() {
        return repo;
    }

    public void setRepo(Repo repo) {
        this.repo = repo;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
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
