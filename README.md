Simple template project for getting started with the `Groovy` programming language.
---

This project uses [JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - you will need to download it first.

It also includes [`Idea`](http://download.jetbrains.com/idea/ideaIC-15.0.exe) integration (i.e. you can start coding in `Groovy` instantly, [`Gradle`](http://gradle.org/getting-started-gradle-java) will download everything it needs) - though you will need to download this IDE manually.
 
The template includes pre-configured code styles settings and inspections for `Groovy` and `Java`.

[`Groovy`](http://www.groovy-lang.org/documentation.html) is provided for as compile and test dependency, and [`Spock`](http://spockframework.github.io/spock/docs) as test-only.
 
In order to get started, just [fork](https://help.github.com/articles/fork-a-repo) this project (or download and push back), open it in `Idea` and get used to running the build (via `Gradle` as `gradlew clean build` or from the `Idea` run config `Clean Build`).
Once you understand how it's `supposed` to work, start hacking around, e.g.:
* modify the `group` in the `build.gradle` file
* change the required `Java` version to `7`
* change the package in the `Dummy.groovy` file
* change the return value of `Dummy.groovy` file and make the test pass again  
... and rerun the build after each step, to verify that all is still working.
 
Happy hacking! :)