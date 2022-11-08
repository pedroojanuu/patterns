package org.example;

public class StringBar extends Bar {
    public StringBar() {
        super();
    }
    public boolean isHappyHour() {
        return this.happyHour;
    }
    public void startHappyHour() {
        this.happyHour = true;
        this.notifyObservers();
    }
    public void endHappyHour() {
        this.happyHour = false;
        this.notifyObservers();
    }
}
