package pokerhand

import io.kotest.matchers.comparables.shouldBeLessThan
import org.junit.jupiter.api.Test


class PokerHandTest {

    @Test
    fun `Compare 2 Cards`() {
        Card(Suit.Club, 3).shouldBeLessThan(Card(Suit.Diamond, 4))
    }
}
