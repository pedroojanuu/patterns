package org.example;

import java.util.List;

public class StringRecipe {
    private List<StringTransformer> list;
    public StringRecipe(List<StringTransformer> list) {
        this.list = list;
    }
    public void mix(StringDrink drink) {
        for (StringTransformer stringTransformer : list) {
            stringTransformer.execute(drink);
        }
    }
}
