package dao;

import entity.User;

import java.util.*;

public class UserDao  {

    private Map<Integer, User> users = new HashMap<>();

    public UserDao() {
    }

    public User getById(int id) {
        return users.get(id);
    }

    public Map getAll() {
        return users;
    }

    public void save(User user) {
        users.put(user.getUserId(), user);
    }

    public void update(User user) {
        users.put(user.getUserId(), user);
    }

    public void delete(int id) {
        users.remove(id);

    }
}
