package org.example.application.repositories;

import org.example.domain.User;

public interface UserRepository {
    User createUser(User user);

    User editUser(User user);

    User deleteUser(User user);

    User findUserByLogIn(String logIn);
}
