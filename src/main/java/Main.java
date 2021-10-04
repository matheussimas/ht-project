import dao.FoodDao;
import dao.UserDao;
import entity.DaysOfWeek;
import entity.Food;
import entity.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int id = 0;
        int choice = 0;
        Food food = new Food();
        FoodDao foodDao = new FoodDao();
        do {
            System.out.println("Digite sua escolha: ");
            System.out.println("1 - Criar um usuario: ");
            System.out.println("2 - Sair do progama: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                User user = new User();
                UserDao userDao = new UserDao();

                System.out.println("Digite seu nome: ");
                user.setName(scanner.next());

                System.out.println("Digite sua idade: ");
                user.setAge(scanner.nextInt());

                System.out.println("Digite seu peso: ");
                user.setWeigth(scanner.nextFloat());

                System.out.println("Digite sua altura: ");
                user.setHeigth(scanner.nextFloat());


                System.out.println("Digite sua porcentagem de gordura:");
                user.setFatPercentage(scanner.nextInt());

                System.out.println("Shoow!! Estamos quase lá!");
                System.out.println("Agora digite um nome de usuario para sua conta na Health Track: ");
                user.setLogin(scanner.next());

                System.out.println("Digite sua senha: ");
                user.setPassword(scanner.next());

                id++;
                user.setUserId(id);
                userDao.save(user);

                int choiceHealth = 0;

                do {
                    System.out.println("Digite o deseja fazer hoje: ");
                    System.out.println("1 - Adicionar uma comida");
                    System.out.println("2 - Retornar lista de comida");
                    System.out.println("3 - Sair");
                    choiceHealth = scanner.nextInt();

                    if (choice == 1) {
                        System.out.println("Digite o nome da comida: ");
                        food.setNameOfFood(scanner.next());

                        System.out.println("Refeição em que ela é consumida (EX: almoço): ");
                        food.setMomentOfDay(scanner.next());

                        System.out.println("Calorias: ");
                        food.setCaloriesPerGram(scanner.nextInt());

                        System.out.println("Dia da semana em que é consumida: ");
                        System.out.println("1 - Domingo ");
                        System.out.println("2 - Segunda ");
                        System.out.println("3 - Terça ");
                        System.out.println("4 - Quarta ");
                        System.out.println("5 - Quinta ");
                        System.out.println("6 - Sexta ");
                        System.out.println("7 - Sabado ");
                        int days = scanner.nextInt();

                        if (days == 1) {
                            food.setDaysOfWeek(DaysOfWeek.DOMINGO);
                        }

                        if (days == 2) {
                            food.setDaysOfWeek(DaysOfWeek.SEGUNDA_FEIRA);
                        }

                        if (days == 3) {
                            food.setDaysOfWeek(DaysOfWeek.TERCA_FEIRA);
                        }

                        if (days == 4) {
                            food.setDaysOfWeek(DaysOfWeek.QUARTA_FEIRA);
                        }

                        if (days == 5) {
                            food.setDaysOfWeek(DaysOfWeek.QUINTA_FEIRA);
                        }

                        if (days == 6) {
                            food.setDaysOfWeek(DaysOfWeek.SEXTA_FEIRA);
                        }

                        if (days == 7) {
                            food.setDaysOfWeek(DaysOfWeek.SABADO);
                        }

                        id++;
                        food.setFoodId(id);
                        foodDao.save(food);

                    }

                    if (choiceHealth == 2) {
                        foodDao.getAll();
                    }
                    if (choiceHealth == 3) {
                        System.out.println("Obrigado!!!");
                    }

                } while (choiceHealth != 3);
            }

        } while (choice != 2);

        System.out.println("Obrigado volte sempre!!!");
    }

}
