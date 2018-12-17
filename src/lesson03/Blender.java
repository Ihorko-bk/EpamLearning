package lesson03;

import java.util.ArrayList;

public class Blender extends Electric {
    public Blender(int power) {
        super("super-puper blender", power);
        canCook = new ArrayList<>();
        canCook.add("pizza");
        canCook.add("tako");
    }

    @Override
    public CookedInPichkaIngredient cook(Ingredient ingredient) {
        return new CookedInPichkaIngredient(getClass().getName() + "red " + ingredient.getName());
    }
}
