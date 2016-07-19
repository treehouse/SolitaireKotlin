class Deck {
    val cards: Array<Card> = Array(52,
            fun(i: Int): Card {
                val value = i % 13
                val suit = when(i / 13) {
                    0 -> "Clubs"
                    1 -> "Diamonds"
                    2 -> "Hearts"
                    else -> "Spades"
                }
                return Card(value, suit)
            })
}