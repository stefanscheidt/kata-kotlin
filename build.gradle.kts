import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
  kotlin("jvm") version "2.2.20"
  application

  id("com.diffplug.spotless") version "8.0.0"
}

kotlin {
  jvmToolchain(21)
  compilerOptions { jvmTarget = JvmTarget.fromTarget("21") }
}

tasks.test {
  useJUnitPlatform()
  testLogging { events("passed", "skipped", "failed") }
}

application {
  mainClass.set("kata.MainKt") // The main class of the application
}

spotless {
  kotlin { ktfmt() }
  kotlinGradle { ktfmt() }
}

repositories { mavenCentral() }

dependencies {
  // https://docs.junit.org/current/user-guide/
  testImplementation(platform("org.junit:junit-bom:6.0.0"))
  testImplementation("org.junit.jupiter:junit-jupiter")

  // https://kotlinlang.org/api/latest/kotlin.test/kotlin.test/
  testImplementation(kotlin("test"))

  // https://kotest.io/docs/assertions/assertions.html
  testImplementation("io.kotest:kotest-assertions-core:6.0.4")

  // https://mockk.io/
  testImplementation("io.mockk:mockk:1.14.6")
}
