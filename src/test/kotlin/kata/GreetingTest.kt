package kata

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class GreetingTest {

  @Test
  fun `greet the world`() {
    hello() shouldBe "Hello, World!"
  }

  @Test
  fun `greet someone`() {
    hello("Some Name") shouldBe "Hello, Some Name!"
  }
}
