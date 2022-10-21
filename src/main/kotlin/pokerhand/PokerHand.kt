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

// Var 1
enum class HandType {
    StraightFlush,
    FourOfAKind
}

// Var 2
data class HandRank(
    val handType: HandType,
    val highCards: List<CardValue>
)

// Var 3
sealed class HandType2 {
    data class StraightFlush(
        val suit: Suit,
        val cards: List<CardValue>
    ) : HandType2()

    data class FourOfAKind(
        val highCardFour: CardValue,
        val highCardSingle: CardValue
    ): HandType2()
}


// comparisonResult.value < 0 means hand1 loses,
// comparisonResult.value > 0 means hand1 wins,
// comparisonResult.value == 0 means draw
fun compare(hand1: Hand, hand2: Hand): ComparisonResult = TODO()