# sonarqube-change
This repo is to reproduce the issue described in:
- https://community.sonarsource.com/t/sonarqube-detects-whole-file-as-new-code-in-shortlived-branches-and-pull-requests-when-only-part-of-the-file-has-changed/8721
- https://community.sonarsource.com/t/whole-files-considered-new-code-in-short-lived-branch/8215/6

## Prerequisites
I had to use my company's repositories in `build.gradle` and `settings.gradle` while setting up this project. I tried setting up what I think would be usable outside my company, but otherwise just setup the appropriate repositories.

Additionally, set the appropriate sonarqube properties in `build.gradle`.

## Steps to reproduce
- `gradle build`
- `gradle sonarqube`
- `git checkout -b sonarqube-test`
- Add a line in `Main.tested()`, e.g. a print statement just before the return statement
- Commit the change
- `gradle build`
- `gradle sonarqube -Dsonar.branch.name=sonarqube-test`
- Go to SonarQube and observe the issue
