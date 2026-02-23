# ⚡ GitHub User Activity CLI

A powerful Java + Spring Boot command-line tool to fetch a GitHub user's:

- 👤 Profile Info  
- 📝 Recent Commits  
- 📦 Public Repositories  

All straight from the terminal using GitHub’s REST API.

---

## 🚀 How to Run

```bash
# Package the application
mvnw.cmd clean package

# Run the CLI tool
java -jar target/github-user-activity-0.0.1-SNAPSHOT.jar

Example output:-
Enter GitHub username: octocat

--- GitHub Profile ---
Name     : The Octocat
Location : San Francisco
Repos    : 8
Followers: 3000

--- Recent Commits ---
[Hello-World] Added README.md
[Hello-World] Initial commit

--- Public Repositories ---
[Hello-World] ⭐ 1500 | 🍴 500
URL: https://github.com/octocat/Hello-World
Desc: My first repository on GitHub!
