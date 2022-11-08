package org.example;

public class StringReplacer implements StringTransformer {
    private char toReplace, replacer;
    public StringReplacer(char toReplace, char replacer) {
        this.toReplace = toReplace;
        this.replacer = replacer;
    }
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(toReplace, replacer));
    }
}
