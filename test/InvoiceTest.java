package test;

import model.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice i1 = new Invoice("X123", "Laptop", 2, 3000.0);
        Invoice i2 = new Invoice("Y999", "Myszka", 0, 50.0); // Zła ilość
        Invoice i3 = new Invoice("Z001", "Monitor", 1, -500.0); // Zła cena

        System.out.println("Faktura 1 - Amount: " + i1.getAmount()); // 6000.0
        System.out.println("Faktura 2 - Amount: " + i2.getAmount()); // 0.0
        System.out.println("Faktura 3 - Amount: " + i3.getAmount()); // 0.0
    }
}

