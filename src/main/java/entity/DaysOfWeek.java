package entity;

public enum DaysOfWeek {

    DOMINGO(1),
    SEGUNDA_FEIRA(2),
    TERCA_FEIRA(3),
    QUARTA_FEIRA(4),
    QUINTA_FEIRA(5),
    SEXTA_FEIRA(6),
    SABADO(7);

    private int days;

    DaysOfWeek(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

}