package org.example;

public class StringInverter implements StringTransformer {
    public void execute(StringDrink drink) {
        StringBuilder stringBuilder = new StringBuilder(drink.getText());
        stringBuilder.reverse();
        drink.setText(stringBuilder.toString());
    }
}
