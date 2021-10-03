import entity.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Criando um usuario
        User user = new User();
        user.include("hjhjh", "njkhjkdhsjdsh", 1, "Lucas", 22, 71.89F, 180.56F,
                12);

        // Criando uma comida e incluindo em dieta
        Food food1 = new Food("pao", "manha", 120, DaysOfWeek.DOMINGO);
        ArrayList<Food> foodToDiet = new ArrayList<>();
        foodToDiet.add(food1);
        Diet diet = new Diet(foodToDiet, "emagrecer", 25, DaysOfWeek.SEGUNDA_FEIRA);
        diet.includeDiet(food1);
        diet.getDiet(diet.getDaysOfWeek());

        // Incluindo exercicios e incluindo para treino
        Exercise exercise1 = new Exercise("Abdominal", 28, 1, false, 120);
        List<Exercise> exercises = new ArrayList<>();
        exercises.add(exercise1);
        Train train = new Train(exercises, "Funcional", 58, DaysOfWeek.QUARTA_FEIRA);
        train.includeExerciseIntoTrain(exercise1);
    }
}
