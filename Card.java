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
    public Card(Suit suit, Rank rank) {
        this.suit=suit;
        this.rank=rank;
    }

    // toString
    public String toString(Card a) {
        return(suit + "; " + rank);
    }

    public boolean equals(Card b) {
        boolean e=false;
        if(this.suit == b.suit) {
            e=true;
        } else {
            if (this.rank == b.rank){
                e=true;
            }
        }
        return e;
    }
}
