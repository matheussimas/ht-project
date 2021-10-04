package dao;

import entity.Food;
import entity.User;
import entity.Diet;

import java.util.HashMap;
import java.util.Map;

public class FoodDao {

    private Map<Integer, Food> foods = new HashMap<>();

    public FoodDao() {
    }

    public Food getById(int id) {
        return foods.get(id);
    }

    public Map getAll() {
        return foods;
    }

    public void save(Food food) {
        foods.put(food.getFoodId(), food);
    }

    public void update(int id) {
        Food userToBeUpdate = foods.get(id);
        foods.put(userToBeUpdate.getFoodId(), userToBeUpdate);
    }

    public void delete(int id) {
        foods.remove(id);

    }
}
