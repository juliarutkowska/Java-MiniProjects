package model;

public class MyDate {
    private int day;
    private int month;
    private int year;

    // Konstruktor z walidacją
    public MyDate(int day, int month, int year) {
        // Sprawdzenie poprawności zakresów
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1; // wartość domyślna
        }

        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }

        if (year >= 1990 && year <= 2050) {
            this.year = year;
        } else {
            this.year = 1990;
        }
    }

    // Gettery i Settery
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1990 && year <= 2050) {
            this.year = year;
        }
    }

    // Wyświetla datę w formacie dd/mm/yyyy
    public void displayDate() {
        System.out.printf("%02d/%02d/%04d\n", day, month, year);
    }
}
