class FoundationPile(val suit: String) {
    val cards: MutableList<Card> = mutableListOf()

    fun reset() {
        cards.clear()
    }

    fun removeCard(card: Card) {
        cards.remove(card)
    }

    fun addCard(card: Card): Boolean {
        var nextValue = 0
        if (cards.size > 0) {
            nextValue = cards.last().value + 1
        }
        if (card.suit == suit && card.value == nextValue) {
            cards.add(card)
            return true
        }
        return false
    }
}