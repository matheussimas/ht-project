package entity;

public class Goal {

    private String description;
    private int weigth;
    private int fatPercentage;

    public Goal(String description, int weigth, int fatPercentage) {
        this.description = description;
        this.weigth = weigth;
        this.fatPercentage = fatPercentage;
    }

    public Goal() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(int fatPercentage) {
        this.fatPercentage = fatPercentage;
    }
}
