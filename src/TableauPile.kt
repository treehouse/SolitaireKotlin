class TableauPile(var cards: MutableList<Card>) {

    init {
        cards.last().faceUp = true
    }

    fun addCards(newCards: MutableList<Card>): Boolean {
        if (newCards.first().value == cards.last().value - 1 &&
                suitCheck(newCards.first(), cards.last())) {

        }
    }

    private fun suitCheck(c1: Card, c2: Card): Boolean {


    }

}