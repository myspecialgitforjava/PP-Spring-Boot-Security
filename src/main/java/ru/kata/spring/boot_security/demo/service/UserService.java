package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUserList();

    User findByUserName(String username);

    void addUser(User user);

    User getUserById(int id);

    void update(int id, User user);

    void delete(int id);

}
