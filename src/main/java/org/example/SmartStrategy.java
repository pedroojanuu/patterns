package org.example;

public class SmartStrategy implements OrderingStrategy {
    private StringOrder order;
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour()) {
            bar.order(drink, recipe);
        } else {
            this.order = new StringOrder(bar, recipe, drink);
        }
    }
    public void happyHourStarted(StringBar bar) {
        bar.order(order.drink, order.recipe);
    }
    public void happyHourEnded(StringBar bar) {}
}
