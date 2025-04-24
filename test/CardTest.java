package test;
import model.Card;
import model.Color;

public class CardTest {
    public static void main(String[] args) {
        Card card1 = new Card(10, Color.KIER);
        Card card2 = new Card(12, Color.PIK);
        Card card3 = new Card(8, Color.KARO);

        System.out.println("Czy card2 przebija card1? " + card2.beats(card1)); // true
        System.out.println("Czy card1 przebija card3? " + card1.beats(card3)); // true
        System.out.println("Czy card3 przebija card2? " + card3.beats(card2)); // false
    }
}
