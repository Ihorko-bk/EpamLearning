package lesson03;

import java.util.ArrayList;

public class Dish {

    ArrayList<CookedInPichkaIngredient> ingredients;
    String name;

    public Dish(ArrayList<CookedInPichkaIngredient> ingredients) {
        this.ingredients = ingredients;
        StringBuilder sb = new StringBuilder("Dish from:");
        for (int i = 0; i < ingredients.size(); i++) {
            sb.append(" " + ingredients.get(i));
        }
        name = sb.toString();
    }




    @Override
    public String toString() {
        return name;
    }
}
