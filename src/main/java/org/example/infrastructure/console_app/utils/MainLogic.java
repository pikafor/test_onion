package org.example.infrastructure.console_app.utils;

import org.example.domain.User;
import org.example.infrastructure.console_app.mapper.UserEntityMapper;
import org.example.infrastructure.console_app.model.UserEntity;
import org.example.infrastructure.console_app.repositories.UserEntityRepository;

import java.util.Scanner;

public class MainLogic implements UserEntityRepository{

    public void process() {
        String logIn, password;

        sendMessage("Введите логин: ");
        logIn = setAnswer();
        sendMessage("Введите пароль: ");
        password = setAnswer();

        UserEntity userEntity = new UserEntity(1, logIn, password);
        System.out.println(createUser(userEntity).toString());
    }

    @Override
    public User createUser(UserEntity userEntity) {
        return new UserEntityMapper().createUser(userEntity);
    }

    private void sendMessage(String message) {
        System.out.print(message);
    }

    private String setAnswer() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }
}
