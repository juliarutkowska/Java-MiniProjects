package model;

// Klasa reprezentująca kartę do gry
public class Card {
    private int value; // wartość karty, np. 2-14 (gdzie 14 to As)
    private Color color; // kolor karty

    // Konstruktor
    public Card(int value, Color color) {
        this.value = value;
        this.color = color;
    }

    // Getter i Setter dla value
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Getter i Setter dla color
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Metoda sprawdzająca czy dana karta przebija drugą
    public boolean beats(Card otherCard) {
        return this.value > otherCard.value;
    }
}