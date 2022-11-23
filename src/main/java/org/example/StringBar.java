package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar {
    private boolean isHappyHour = false;
    public StringBar() {
        super();
    }
    public StringBar(List<BarObserver> observers) {
        super(observers);
    }
    public boolean isHappyHour() {
        return this.isHappyHour;
    }
    public void startHappyHour() {
        this.isHappyHour = true;
        this.notifyObservers();
    }
    public void endHappyHour() {
        this.isHappyHour = false;
        this.notifyObservers();
    }
    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }
}
