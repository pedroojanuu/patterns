package org.example;

public class StringCaseChanger implements StringTransformer {
    public void execute(StringDrink drink) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = drink.getText().toCharArray();
        for (char c : chars) {
            if (Character.isLowerCase(c)) {
                //Character.toUpperCase(c);
                stringBuilder.append(Character.toUpperCase(c));
            } else {
                //Character.toLowerCase(c);
                stringBuilder.append(Character.toLowerCase(c));
            }
        }
        drink.setText(stringBuilder.toString());
    }
}
