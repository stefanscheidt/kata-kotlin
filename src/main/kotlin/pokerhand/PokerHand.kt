package pokerhand

enum class Suit {
    Club, Diamond, Hearts, Spade
}

// possible improvement: make this a real type
typealias CardValue = Int

data class Card(val suit: Suit, val value: CardValue)
