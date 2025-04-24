package model;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    // Konstruktor domyślny
    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Konstruktor z 3 parametrami
    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    // Konstruktor z czasem w sekundach od północy
    public Clock(int totalSeconds) {
        this.hours = (totalSeconds / 3600) % 24;
        this.minutes = (totalSeconds % 3600) / 60;
        this.seconds = totalSeconds % 60;
    }

    // Gettery
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    // Settery z walidacją
    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        }
    }

    // Inkrementacja sekund
    public void tick() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours = (hours + 1) % 24;
            }
        }
    }

    // Dekrementacja sekund
    public void tickDown() {
        seconds--;
        if (seconds < 0) {
            seconds = 59;
            minutes--;
            if (minutes < 0) {
                minutes = 59;
                hours = (hours - 1 + 24) % 24;
            }
        }
    }

    // Zwraca ładny string np. [03:04:09]
    public String toString() {
        return String.format("[%02d:%02d:%02d]", hours, minutes, seconds);
    }
}