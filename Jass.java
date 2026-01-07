/**
 * Diese Klasse ist die Hauptklasse und enthält die main-Methode
 * In der main-Methode soll eine neues (vollstänidges) Deck erzeugt
 * und gemischt werden. Dann sollen (als Testcode) von diesem Deck 30 Karten entfernt
 * werden und anschliessend das EICHELN ASS hinzugefügt werden
 * Danach sollen alle Karten auf der Konsole ausgegeben werden.
 */
import java.util.Arrays;
public class Jass {
    public static void main(String[] args) {
        // Deck testdeck = new Deck();
        // testdeck.shuffle();
        // int i = 1;
        // while(i<31){
        //     testdeck.pop();
        //     i++;
        // }
        // Card testeichelass = new Card(Suit.EICHELN, Rank.ASS);
        // testdeck.addCard(testeichelass);
        // System.out.println(Arrays.toString(testdeck.getCards()));


        // Generiere in der Klasse `Jass` einen gültigen Schieber-Jass zwischen 4 Computerspielern, welche jeweils gültige Karten ausspielen:
        Deck deck = new Deck();
        deck.shuffle();
        Deck player1 = new Deck(new Card[0]);
        Deck player2 = new Deck(new Card[0]);
        Deck player3 = new Deck(new Card[0]);
        Deck player4 = new Deck(new Card[0]);
        for(int i=0; i<9; i++){
            player1.addCard(deck.pop());
            player2.addCard(deck.pop());
            player3.addCard(deck.pop());
            player4.addCard(deck.pop());
        }
        System.out.println("player1"+player1.toString());
        System.out.println("player2"+player2.toString());
        System.out.println("player3"+player3.toString());
        System.out.println("player4"+player4.toString());

        for(int i=0; i<9; i++){
            Deck playedDeck= new Deck(new Card[0]);
            Card[] validCards1 = player1.validCards(playedDeck);
            Card card1=validCards1[0];
            player1.kartespielen(card1);
            Card cardspielen1=player1.pop();
            playedDeck.addCard(cardspielen1);

            Card[] validCards2 = player2.validCards(playedDeck);
            Card card2=validCards2[0];
            player2.kartespielen(card2);
            Card cardspielen2=player2.pop();
            playedDeck.addCard(cardspielen2);
            
            Card[] validCards3 = player3.validCards(playedDeck);
            Card card3=validCards3[0];
            player3.kartespielen(card3);
            Card cardspielen3=player3.pop();
            playedDeck.addCard(cardspielen3);
            
            Card[] validCards4 = player4.validCards(playedDeck);
            Card card4=validCards4[0];
            player4.kartespielen(card4);
            Card cardspielen4=player4.pop();
            playedDeck.addCard(cardspielen4);
            
            System.out.println("player1"+player1.toString());
            System.out.println("player2"+player2.toString());
            System.out.println("player3"+player3.toString());
            System.out.println("player4"+player4.toString());
        }
    }
}
