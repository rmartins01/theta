package co.flexidev.theta.service;

import java.util.List;

import co.flexidev.theta.model.User;

public interface UserService {

    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}
