package org.example.infrastructure.console_app.repositories;

import org.example.domain.User;
import org.example.infrastructure.console_app.model.UserEntity;

public interface UserEntityRepository {
    User createUser(UserEntity userEntity);
}
