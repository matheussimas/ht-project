package entity;

import java.util.ArrayList;
import java.util.List;

public class Train extends Routine {

    private List<Exercise> exercises;

    public Train(List<Exercise> exercises, String name, int intensity, DaysOfWeek daysOfWeek) {
        this.exercises = exercises;
        this.name = name;
        this.intensity = intensity;
        this.daysOfWeek = daysOfWeek;
    }

    public Train() {
    }

    public boolean includeExerciseIntoTrain(Exercise exercise) {
        List<Exercise> exercisesToTrain = new ArrayList<>();
        exercisesToTrain.add(exercise);

        Train train = new Train();
        train.setExercises(exercisesToTrain);
        train.setIntensity(this.intensity);
        train.setName(this.name);
        train.setDaysOfWeek(this.daysOfWeek);
        System.out.println(train);
        return true;
    }

    public Train getTrainByDay(DaysOfWeek dayOfWeekCompared) {
        if (dayOfWeekCompared == this.daysOfWeek) {
            System.out.println(dayOfWeekCompared);
            return this;
        }
        return null;
    }

    public String calculateLostKg(int lastKg, int actualKg) {
        int lostedKG = lastKg - actualKg;

        return "Você perdeu " + lostedKG + "Kg";
    }


    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    @Override
    public String toString() {
        return "\nTrain {" +
                "name='" + name + '\'' +
                ", intensity=" + intensity +
                ", daysOfWeek=" + daysOfWeek +
                ", exercises=" + exercises +
                '}';
    }
}
