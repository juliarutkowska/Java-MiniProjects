package test;
import model.Clock;

public class ClockTest {
    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 59);
        System.out.println("Zegar przed tick: " + clock);
        clock.tick(); // Powinno być 00:00:00
        System.out.println("Zegar po tick: " + clock);

        clock.tickDown(); // Cofamy o sekundę – wraca 23:59:59
        System.out.println("Zegar po tickDown: " + clock);
    }
}

