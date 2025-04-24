package model;

public class Numbers {
    private int a, b, c;

    // Konstruktor
    public Numbers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Zwraca sumę liczb
    public int sum() {
        return a + b + c;
    }

    // Zwraca średnią arytmetyczną
    public double average() {
        return (a + b + c) / 3.0;
    }

    // Zwraca minimum
    public int min() {
        return Math.min(a, Math.min(b, c));
    }

    // Zwraca maksimum
    public int max() {
        return Math.max(a, Math.max(b, c));
    }

    // Zwraca średnią geometryczną
    public double geometric() {
        return Math.cbrt(a * b * c); // pierwiastek trzeciego stopnia
    }
}

