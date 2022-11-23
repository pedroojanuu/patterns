package org.example;

public abstract class AlienClient implements Client{
    private OrderingStrategy strategy;
    public AlienClient() {
        this.strategy = createOrderingStrategy();
    }
    public void happyHourStarted(Bar bar) {
        strategy.happyHourStarted((StringBar) bar);
    }
    public void happyHourEnded(Bar bar) {
        strategy.happyHourEnded((StringBar) bar);
    }
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink, recipe, bar);
    }
    protected abstract OrderingStrategy createOrderingStrategy();
}
