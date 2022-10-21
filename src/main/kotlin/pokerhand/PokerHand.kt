package pokerhand

enum class Suit {
    Club, Diamond, Hearts, Spade
}

// possible improvement: make this a real type
typealias CardValue = Int

data class Card(val suit: Suit, val value: CardValue) : Comparable<Card> {
    override fun compareTo(other: Card): Int =
        value.compareTo(other.value)

}

data class ComparisonResult(val result: Int)

data class Hand(val card1: Card, val card2: Card, val card3: Card, val card4: Card, val card5: Card)

// comparisonResult.value < 0 means hand1 loses,
// comparisonResult.value > 0 means hand1 wins,
// comparisonResult.value == 0 means draw
fun compare(hand1: Hand, hand2: Hand): ComparisonResult = TODO()