package lesson03;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Electric implements Comparator, Comparable {
    private String name;
    private int power;
    protected ArrayList<String> canCook;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return Integer.compare(((Electric) o1).power, ((Electric) o2).power);
    }

    @Override
    public String toString() {
        return name + "with power " + power;
    }

    public boolean isCanDo(String some) {
        for (int i = 0; i < canCook.size(); i++) {
            if (canCook.get(i).equals(some)) return true;
        }
        return false;
    }

    public abstract CookedInPichkaIngredient cook(Ingredient ingredient);

    public Electric(String name, int power) {
        this.name = name;
        this.power = power;
    }


    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.power, ((Electric) o).power);
    }
}
