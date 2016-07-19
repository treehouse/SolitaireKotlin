class GameModel {
    val deck = Deck()
    val wastePile: MutableList<Card> = mutableListOf()
    val foundationPiles = arrayOf(FoundationPile("Diamonds"), FoundationPile("Hearts"), FoundationPile("Clubs"), FoundationPile("Spades"))
}