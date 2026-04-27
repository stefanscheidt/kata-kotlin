default:
    @just --list

# Apply spotless formatting and build the project
build:
    ./gradlew spotlessApply build

# Build the project and run all checks
verify: build
    ./gradlew check
