package org.example;

public class HumanClient implements Client {
    private OrderingStrategy strategy;
    public HumanClient(OrderingStrategy strategy) {
        this.strategy = strategy;
    }
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink, recipe, bar);
    }
    public void happyHourStarted(Bar bar) {
        if (bar instanceof StringBar) {
            strategy.happyHourStarted((StringBar) bar);
        }
    }
    public void happyHourEnded(Bar bar) {
        if (bar instanceof StringBar) {
            strategy.happyHourEnded((StringBar) bar);
        }
    }
}
