package model;

public class Invoice {
    private String productNumber;
    private String productDescription;
    private int quantity;
    private double pricePerItem;

    // Konstruktor
    public Invoice(String productNumber, String productDescription, int quantity, double pricePerItem) {
        this.productNumber = productNumber;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Settery i Gettery
    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    // Oblicza wartość faktury
    public double getAmount() {
        if (pricePerItem <= 0 || quantity <= 0) {
            return 0;
        }
        return quantity * pricePerItem;
    }
}

