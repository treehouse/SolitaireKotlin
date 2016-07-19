val clubs = "Clubs"
val diamonds = "Diamonds"
val hearts = "Hearts"
val spades = "Spades"
val redSuits = arrayOf(diamonds, hearts)
val blackSuits = arrayOf(clubs, spades)

class Card(val value: Int, val suit: String, var faceUp: Boolean = false) {

}