# kata-kotlin

Baseline for katas using Kotlin with JUnit 5.

## Prerequisites

* JDK 21
* IDE support for Kotlin 1.9

You can install a Java SDK locally via [SDKMAN!](https://sdkman.io/) by issuing the command [`sdk env`](https://sdkman.io/usage#env) in this project root directory, see [.sdkmanrc](.sdkmanrc).

Check out [the Gradle build file](./build.gradle.kts) for already added dependencies and feel free to adjust them as you wish.

## Build and run

Build:

```shell
./gradew build
```

Run:

```shell
./gradew run --args="one two three"
```
