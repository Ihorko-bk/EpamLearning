package lesson03;

import java.util.ArrayList;
import java.util.Collections;

public class Kitchen {
    public static void main(String[] args) {

        // what is this sh#t?

        ArrayList<Electric> prybory = new ArrayList<>();
        prybory.add(new Blender(300));
        prybory.add(new Blender(250));
        prybory.add(new Pichka(1000));
        prybory.add(new Pichka(1500));
        prybory.add(new Pichka(800));

        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("potato"));
        ingredients.add(new Ingredient("egg"));
        ingredients.add(new Ingredient("meat"));
        ingredients.add(new Ingredient("frog"));
        ingredients.add(new Ingredient("cream"));

        ArrayList<Electric> whoCanDoATort = getWhatCanDoSome(prybory, "tort");
        Collections.sort(whoCanDoATort);
        System.out.println(whoCanDoATort.size());
        for (Electric e: whoCanDoATort) {
            System.out.println(e);
        }


    }

    public static ArrayList<Electric> getWhatCanDoSome(ArrayList<Electric> electrics, String some) {
        ArrayList<Electric> doing = new ArrayList<>();
        for (int i = 0; i < electrics.size(); i++) {
            if (electrics.get(i).isCanDo(some)) doing.add(electrics.get(i));
        }
        return doing;
    }

}
