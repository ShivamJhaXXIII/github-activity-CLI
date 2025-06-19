package com.shivam.github_activity;

import java.util.List;

/**
 * Represents a GitHub event (such as a push, pull request, etc.) for a user.
 */
public class GitHubEvent {
    /** The type of event (e.g., PushEvent, PullRequestEvent) */
    private String type;
    /** The creation timestamp of the event */
    private String created_at;
    /** The repository associated with the event */
    private Repo repo;
    /** The payload containing event-specific data */
    private Payload payload;

    /**
     * Represents the repository involved in the event.
     */
    public static class Repo {
        private String name;
        /**
         * Sets the repository name.
         */
        public void setName(String name) {
           this.name = name;
        }
        /**
         * Gets the repository name.
         */
        public String getName() {
            return this.name;
        }
    }

    /**
     * Represents the payload of the event, such as commits for a push event.
     */
    public static class Payload {
        private List<Commit> commits;
        /**
         * Gets the list of commits in the payload.
         */
        public List<Commit> getCommits() {
            return commits;
        }
        /**
         * Sets the list of commits in the payload.
         */
        public void setCommits(List<Commit> commits) {
            this.commits = commits;
        }
        /**
         * Represents a commit in a push event payload.
         */
        public static class Commit {
            private String message;
            /**
             * Gets the commit message.
             */
            public String getMessage() {
                return message;
            }
            /**
             * Sets the commit message.
             */
            public void setMessage(String message) {
                this.message = message;
            }
        }
    }

    /** Default constructor */
    public GitHubEvent() {
    }

    /**
     * Constructs a GitHubEvent with all fields.
     */
    public GitHubEvent(String type, String created_at, Repo repo, Payload payload) {
        this.type = type;
        this.created_at = created_at;
        this.repo = repo;
        this.payload = payload;
    }

    /** Gets the repository. */
    public Repo getRepo() {
        return repo;
    }
    /** Sets the repository. */
    public void setRepo(Repo repo) {
        this.repo = repo;
    }
    /** Gets the payload. */
    public Payload getPayload() {
        return payload;
    }
    /** Sets the payload. */
    public void setPayload(Payload payload) {
        this.payload = payload;
    }
    /** Gets the event type. */
    public String getType() {
        return type;
    }
    /** Sets the event type. */
    public void setType(String type) {
        this.type = type;
    }
    /** Gets the creation timestamp. */
    public String getCreated_at() {
        return created_at;
    }
    /** Sets the creation timestamp. */
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
