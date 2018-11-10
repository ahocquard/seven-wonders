# [WIP] Seven wonders in Kotlin!

The goal of this project is to implement Seven Wonders board game.

## Dependencies

To run the project, you will need

- [Gradle](https://gradle.org) in it's version 4.10

The project uses

- [Kotlintest](https://github.com/kotlintest/kotlintest) for testing purpose


## Testing

With gradlew:

```
chmod +x gradlew
./gradlew clean
```


With docker. It is slow because it restarts the daemon each start.

```
docker run --rm -v "$PWD":/home/gradle/project -v ~/.gradle/caches:/home/gradle/.gradle/caches  -w /home/gradle/project gradle:4.10.0-jdk8 gradle clean
```
