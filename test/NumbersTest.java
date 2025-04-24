package test;

import model.Numbers;

public class NumbersTest {
    public static void main(String[] args) {
        Numbers n = new Numbers(2, 4, 8);
        System.out.println("Suma: " + n.sum());
        System.out.println("Średnia: " + n.average());
        System.out.println("Min: " + n.min());
        System.out.println("Max: " + n.max());
        System.out.println("Śr. geometryczna: " + n.geometric());
    }
}
