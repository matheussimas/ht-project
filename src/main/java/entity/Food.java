package entity;

public class Food {

    private String nameOfFood;
    private String momentOfDay;
    private int caloriesPerGram;
    private DaysOfWeek daysOfWeek;
    private int foodId;

    public Food(String nameOfFood, String momentOfDay, int caloriesPerGram, DaysOfWeek daysOfWeek) {
        this.nameOfFood = nameOfFood;
        this.momentOfDay = momentOfDay;
        this.caloriesPerGram = caloriesPerGram;
        this.daysOfWeek = daysOfWeek;
    }

    public Food() {
    }

    public String getNameOfFood() {
        return nameOfFood;
    }

    public void setNameOfFood(String nameOfFood) {
        this.nameOfFood = nameOfFood;
    }

    public String getMomentOfDay() {
        return momentOfDay;
    }

    public void setMomentOfDay(String momentOfDay) {
        this.momentOfDay = momentOfDay;
    }

    public int getCaloriesPerGram() {
        return caloriesPerGram;
    }

    public void setCaloriesPerGram(int caloriesPerGram) {
        this.caloriesPerGram = caloriesPerGram;
    }

    public DaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(DaysOfWeek daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\nname_of_food='" + nameOfFood + '\'' +
                ", \nmomentOfDay='" + momentOfDay + '\'' +
                ", \ncaloriesPerGram=" + caloriesPerGram +
                ", \ndaysOfWeek=" + daysOfWeek +
                '}';
    }
}
