# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Commands

```bash
./gradlew build            # compile and test
./gradlew test             # run all tests
./gradlew test --tests "kata.GreetingTest"                    # run one test class
./gradlew test --tests "kata.GreetingTest.greet the world"    # run one test method
./gradlew spotlessCheck    # check formatting
./gradlew spotlessApply    # auto-format
./gradlew run --args="..."  # run the application
```

## Architecture

This is a single-module Gradle project (Kotlin JVM) used as a kata baseline. All production code lives under `src/main/kotlin/kata/` and all tests under `src/test/kotlin/kata/`. There are no sub-projects.

**Stack:**
- JDK 21 (managed via SDKMAN — see `.sdkmanrc`)
- JUnit Jupiter for test discovery, Kotest assertions (`shouldBe` infix style), MockK for mocking
- Spotless + ktfmt for formatting (2-space indent, 100-char line limit, official Kotlin style)
- Configuration cache enabled (`gradle.properties`)

## Test conventions

- Test class names end in `Test`
- Test method names use backtick strings: `fun \`greet the world\`()`
- Assertions use Kotest infix syntax: `result shouldBe "Hello, World!"`
