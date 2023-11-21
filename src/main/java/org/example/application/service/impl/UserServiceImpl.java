package org.example.application.service.impl;

import javax.inject.Inject;
import org.example.application.repositories.UserRepository;
import org.example.application.service.UserService;
import org.example.domain.User;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Inject
    UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    @Override
    public User editUser(User user) {
        return null;
    }

    @Override
    public User deleteUser(User user) {
        return null;
    }

    @Override
    public User findUserById(User user) {
        return null;
    }
}
