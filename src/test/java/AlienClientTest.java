import org.example.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlienClientTest {
    private StringRecipe getRecipe() {
    StringInverter si = new StringInverter();
    StringCaseChanger cc = new StringCaseChanger();
    StringReplacer sr = new StringReplacer('A', 'X');

    List<StringTransformer> transformers = new ArrayList<>();
    transformers.add(si);
    transformers.add(cc);
    transformers.add(sr);

    StringRecipe recipe = new StringRecipe(transformers);
    return recipe;
}
    @Test
    public void ferengiAlreadyOpened() {
        StringBar stringBar = new StringBar();
        StringDrink drink = new StringDrink("AbCd-aBcD");
        StringRecipe recipe = getRecipe();

        FerengiClient client = new FerengiClient();
        stringBar.startHappyHour();

        client.wants(drink, recipe, stringBar);
        assertEquals("dCbX-DcBa", drink.getText());
    }
    @Test
    public void ferengiStartClosed() {
        StringBar stringBar = new StringBar();
        StringDrink drink = new StringDrink("AbCd-aBcD");
        StringRecipe recipe = getRecipe();

        FerengiClient client = new FerengiClient();
        stringBar.addObserver(client);

        client.wants(drink, recipe, stringBar);
        assertEquals("AbCd-aBcD", drink.getText());

        stringBar.startHappyHour();
        assertEquals("dCbX-DcBa", drink.getText());
    }
    @Test
    public void romulan() {
        StringBar stringBar = new StringBar();
        StringDrink drink = new StringDrink("AbCd-aBcD");
        StringRecipe recipe = getRecipe();

        RomulanClient client = new RomulanClient();

        client.wants(drink, recipe, stringBar);
        assertEquals("dCbX-DcBa", drink.getText());
    }
}
