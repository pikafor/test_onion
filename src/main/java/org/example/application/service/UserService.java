package org.example.application.service;

import org.example.domain.User;

public interface UserService {
    User createUser(User user);

    User editUser(User user);

    User deleteUser(User user);

    User findUserById(User user);
}
