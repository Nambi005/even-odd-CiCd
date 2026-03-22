# Even/Odd Checker CI/CD Project

This is a simple Java project created to demonstrate the basics of **CI/CD using GitHub Actions**.

---

##  What this project does

- Checks whether a number is **even or odd**
- Includes **unit tests using JUnit**
- Runs tests automatically using a **CI pipeline**

---

##  Technologies used

- Java
- Maven
- JUnit
- GitHub Actions

---

##  How CI/CD works in this project

- When code is pushed to the repository:
  - GitHub Actions automatically starts
  - The project is built using Maven
  - All tests are executed
  - The result (success/failure) is shown in the Actions tab

---

##  Example

- Input: `4` → Even → `true`
- Input: `5` → Odd → `true`

These cases are tested automatically using JUnit.

---

##  What I learned

- How to structure a Java project using Maven
- How to write basic unit tests
- How CI pipelines work in GitHub Actions
- How to debug build failures in a CI environment

---

##  Purpose

This project was created to understand how **automated testing and CI/CD pipelines** work in a real-world development workflow.

---

##  How to run locally

```bash
mvn test
