package entity;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String login;
    private String password;
    private int userId;
    private String name;
    private int age;
    private float heigth;
    private float weigth;
    private int fatPercentage;

    public User(String login, String password, int userId, String name, int age, float heigth, float weigth, int fatPercentage) {
        this.login = login;
        this.password = password;
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.heigth = heigth;
        this.weigth = weigth;
        this.fatPercentage = fatPercentage;
    }

    public User() {
    }

    public boolean include(String login, String password, int userId, String name, int age, float heigth, float weigth,
                           int fatPercentage) {
        List<User> users = new ArrayList<>();
        User newUser = new User(login, password, userId, name, age, heigth, weigth, fatPercentage);
        users.add(newUser);
        return true;
    }

    public int getGoalPercentage() {
        return 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeigth() {
        return heigth;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    public int getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(int fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", heigth=" + heigth +
                ", weigth=" + weigth +
                ", fatPercentage=" + fatPercentage +
                '}';
    }
}
