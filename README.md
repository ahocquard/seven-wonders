# [WIP] Seven wonders in Kotlin

## Dependencies

To run the project, you have to install:

- [Gradle](https://gradle.org) in it's version 4.10

The project uses:

- Native Kotlin 1.3
- [Kotlintest](https://github.com/kotlintest/kotlintest) for testing purpose


## Testing

With gradlew:

```
chmod +x gradlew
./gradlew clean ktlintCheck test cucumber build
```


You can also test it with docker. It is far slower though because you start a new daemon:

```
docker run --rm -v "$PWD":/home/gradle/project -v ~/.gradle/caches:/home/gradle/.gradle/caches  -w /home/gradle/project gradle:4.10.0-jdk8 gradle clean ktlintCheck test cucumber build
```
