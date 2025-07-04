import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "2.1.21"
  application

  id("com.diffplug.spotless") version "7.0.4"
}

kotlin { jvmToolchain { this.languageVersion.set(JavaLanguageVersion.of(21)) } }

tasks.withType<KotlinCompile> { kotlinOptions.jvmTarget = "21" }

tasks.test {
  useJUnitPlatform()
  testLogging { events("passed", "skipped", "failed") }
}

application {
  mainClass.set("kata.MainKt") // The main class of the application
}

spotless { kotlin { ktfmt() } }

repositories { mavenCentral() }

dependencies {
  // https://junit.org/junit5/docs/current/user-guide/
  testImplementation(platform("org.junit:junit-bom:5.13.3"))
  testImplementation("org.junit.jupiter:junit-jupiter")

  // https://kotlinlang.org/api/latest/kotlin.test/kotlin.test/
  testImplementation(kotlin("test"))

  // https://kotest.io/docs/assertions/assertions.html
  testImplementation("io.kotest:kotest-assertions-core:5.9.1")

  // https://mockk.io/
  testImplementation("io.mockk:mockk:1.14.4")
}
