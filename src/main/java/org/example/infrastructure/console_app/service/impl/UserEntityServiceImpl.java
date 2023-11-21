package org.example.infrastructure.console_app.service.impl;

import org.example.domain.User;
import org.example.infrastructure.console_app.mapper.UserEntityMapper;
import org.example.infrastructure.console_app.model.UserEntity;
import org.example.infrastructure.console_app.repositories.UserEntityRepository;
import org.example.infrastructure.console_app.service.UserEntityService;

public class UserEntityServiceImpl implements UserEntityService {
    private final UserEntityRepository userEntityRepository;

    UserEntityServiceImpl(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    public User createUser(UserEntity userEntity) {
        return userEntityRepository.createUser(userEntity);
    }
}
