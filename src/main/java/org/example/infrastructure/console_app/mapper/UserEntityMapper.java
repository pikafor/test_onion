package org.example.infrastructure.console_app.mapper;

import org.example.domain.User;
import org.example.infrastructure.console_app.model.UserEntity;
import org.example.infrastructure.console_app.repositories.UserEntityRepository;

public class UserEntityMapper implements UserEntityRepository {
    @Override
    public User createUser(UserEntity userEntity) {
        return new User(userEntity.getId(), userEntity.getLogIn(), userEntity.getPassword());
    }
}
