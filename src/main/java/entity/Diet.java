package entity;

import java.util.ArrayList;

public class Diet extends Routine {

    private ArrayList<Food> diets = new ArrayList<>();

    public Diet(ArrayList<Food> diets, String name, int intensity, DaysOfWeek daysOfWeek) {
        this.name = name;
        this.intensity = intensity;
        this.daysOfWeek = daysOfWeek;
        this.diets = diets;
    }

    public Diet() {
    }

    public boolean includeDiet(Food food) {

        ArrayList<Food> foodList = new ArrayList<>();
        foodList.add(food);
        Diet dietToBeIncluded = new Diet();
        dietToBeIncluded.setDiets(foodList);
        dietToBeIncluded.setName(this.name);
        dietToBeIncluded.setIntensity(this.intensity);
        dietToBeIncluded.setDaysOfWeek(this.daysOfWeek);

        return true;
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


    @Override
    public String toString() {
        return "\nDiets {" + diets +
                ",\nname='" + name + '\'' +
                ",\nintensity=" + intensity +
                '}';
    }
}
