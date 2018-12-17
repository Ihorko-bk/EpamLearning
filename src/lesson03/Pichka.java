package lesson03;

import java.util.ArrayList;

public class Pichka extends Electric {
    public Pichka(int power) {
        super("pipichka", power);
        canCook = new ArrayList<>();
        canCook.add("tort");
        canCook.add("pizza");
        canCook.add("tako");
    }

    @Override
    public CookedInPichkaIngredient cook(Ingredient ingredient) {
        return new CookedInPichkaIngredient("Cooked in " + getClass().getName() + " " + ingredient.getName());
    }
}
