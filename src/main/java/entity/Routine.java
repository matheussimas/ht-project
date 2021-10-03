package entity;

abstract class Routine {

    protected String name;
    protected int intensity;
    protected DaysOfWeek daysOfWeek;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public DaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(DaysOfWeek daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }
}
