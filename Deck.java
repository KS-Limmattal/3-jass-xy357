import java.util.Random;
import java.util.Arrays;

/**
 * Diese Klasse repräsentiert einen Kartenstapel mit einer variablen Anzahl
 * Karten
 * Sie soll ein Array cards von Typ Card als Instanzvariable haben,
 * - einen Konstruktor Deck(Card[] cards), welches eine Instanz bestehend aus
 * den gegebenen Karten kreiert,
 * - einen Konstruktor Deck(), welcher ein vollständiges Kartenset (4x9 Karten)
 * erzeugt,
 * - einen (trivialen) Getter getCards()
 * - eine Methode addCard(Card card), welche zum Deck eine Karte hinzufügt,
 * falls diese noch nicht im Deck enthalten ist und andernfalls eine Warnung auf
 * der Konsole ausgibt
 * - eine Methode pop(), welche die letzte Karte im Array aus dem Deck entfernt,
 * sofern Karten vorhanden sind
 * - eine Methode shuffle(), welche die Karten im Array durchmischt
 * 
 * Tipps:
 * - Um ein Array zu redimensionieren, verwende den Befehl "Arrays.copyOf" aus
 * java.util.Arrays
 * - Um eine zufällige Ganzzahl in einem gegebenen Bereich zu erzeugen, verwende
 * "rnd.nextInt", wobei "rnd" eine Instanz der Klasse "Random" aus
 * "java.util.Random" bezeichnet
 *
 */
public class Deck {
    //Instanzvariable cards (Array Typ Card)
    Card[] cards;

    //Konstruktor
    public Deck(Card[] cards){
         this.cards=cards;
    }

    public Deck(){
        this.cards = new Card[36];
        int count = 0;
        for(Suit suit: Suit.values()){
            for(Rank rank: Rank.values()){
                this.cards[count] = new Card(suit,rank);
                count++;
            }
        }
    }

    //Getter
    public Card[] getCards(){
        return cards;
    }

    //
    public Card[] addCard(Card card){
        int length = cards.length;
        boolean e = false;
        for(int i=0; i<length; i++){
            e=card.equals(cards[i]);
            if(e==false){
                continue;
            } else {
                System.out.println("Warnung: Karte schon vorhanden");
                break;
            }
        }
        if(e==false){
        this.cards = Arrays.copyOf(cards, cards.length + 1);
        cards[length+1]= card;
        }
        return cards;
    }

    public Card[] pop(){
        this.cards=Arrays.copyOf(cards,cards.length-1);
        return cards;
    }

    public Card[] shuffle(){
        int length = cards.length;
        for(int i=0; i<length; i++){
            Random rnd = new Random();
            int r = rnd.nextInt(length-1);
            Card a = cards[r];
            cards[r] = cards[i];
            cards[i] = a;
        }
    return cards;
    }
}
