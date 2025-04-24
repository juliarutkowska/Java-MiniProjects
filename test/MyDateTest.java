package test;

import model.MyDate;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(21, 3, 2051); // Rok niepoprawny – ustawiony na 1990
        MyDate d2 = new MyDate(5, 12, 2000);
        MyDate d3 = new MyDate(31, 0, 1999); // Miesiąc niepoprawny – ustawiony na 1

        d1.displayDate(); // 21/03/1990
        d2.displayDate(); // 05/12/2000
        d3.displayDate(); // 31/01/1999
    }
}

