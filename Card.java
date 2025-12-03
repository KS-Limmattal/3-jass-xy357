/**
 * Diese Klasse repräsentiert eine Karte (Bsp. EICHELN ASS)
 * Sie soll Instanzvariablen von Typ "Suit" und "Rank" haben,
 * einen Konstruktor, eine Methode "toString()" zur Representation
 * als Zeichenkette, sowie eine "equals(Card other)" Methode, welche
 * zurückgibt, ob die aktuelle Karte gleichen Suit und Rank wie die
 * andere Karte hat.
 */
public class Card {

    //Instanzvariablen
    private Suit suit;
    private Rank rank;

    // Konstruktor
    public Card(suit, rank) {
        this.suit=suit;
        this.rank=rank;
    }

    // toString
    public String toString(Card a) {
        return(suit + "; " + rank);
    }

    public boolean equals(Card b) {
        boolean b=false;
        if(this.suit = suit) {
            
        }
    }
}
