package entity;

import java.util.ArrayList;

public class Diet extends Routine {

    private ArrayList<Food> diets = new ArrayList<>();
    private int dietId;

    public Diet(ArrayList<Food> diets, String name, int intensity, DaysOfWeek daysOfWeek) {
        this.name = name;
        this.intensity = intensity;
        this.daysOfWeek = daysOfWeek;
        this.diets = diets;
    }

    public Diet() {
    }

    public Diet getDiet(DaysOfWeek daysOfWeek) {
        if (daysOfWeek == this.daysOfWeek) {
            return this;
        }
        return null;
    }

    public ArrayList<Food> getDiets() {
        return diets;
    }

    public void setDiets(ArrayList<Food> diets) {
        this.diets = diets;
    }

    public int getDietId() {
        return dietId;
    }

    public void setDietId(int dietId) {
        this.dietId = dietId;
    }

    @Override
    public String toString() {
        return "\nDiets {" + diets +
                ",\nname='" + name + '\'' +
                ",\nintensity=" + intensity +
                '}';
    }
}
