package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> listUsers();
    void deleteUserById(Integer id);
    void updateUser(Integer id, User user);
    User getUserById(Integer id);
    User getUserByEmail(String email);
}