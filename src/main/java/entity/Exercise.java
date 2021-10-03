package entity;

public class Exercise {

    private String nome;
    private int intensity;
    private int duration;
    private boolean isEquipRequired;
    private int coloriesPerMinute;

    public Exercise(String nome, int intensity, int duration, boolean isEquipRequired, int coloriesPerMinute) {
        this.nome = nome;
        this.intensity = intensity;
        this.duration = duration;
        this.isEquipRequired = isEquipRequired;
        this.coloriesPerMinute = coloriesPerMinute;
    }

    public Exercise(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isEquipRequired() {
        return isEquipRequired;
    }

    public void setEquipRequired(boolean equipRequired) {
        isEquipRequired = equipRequired;
    }

    public int getColoriesPerMinute() {
        return coloriesPerMinute;
    }

    public void setColoriesPerMinute(int coloriesPerMinute) {
        this.coloriesPerMinute = coloriesPerMinute;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "nome='" + nome + '\'' +
                ", intensity=" + intensity +
                ", duration=" + duration +
                ", isEquipRequired=" + isEquipRequired +
                ", coloriesPerMinute=" + coloriesPerMinute +
                '}';
    }
}
