package org.example.infrastructure.console_app.utils;

import org.example.domain.User;
import org.example.infrastructure.console_app.mapper.UserEntityMapper;
import org.example.infrastructure.console_app.model.UserEntity;
import org.example.infrastructure.console_app.repositories.UserEntityRepository;

public class MainLogic implements UserEntityRepository{

    public void process() {
        UserEntity userEntity = new UserEntity(1, "Ivan", "1488");
        System.out.println(createUser(userEntity).toString());
    }

    @Override
    public User createUser(UserEntity userEntity) {
        return new UserEntityMapper().createUser(userEntity);
    }
}
