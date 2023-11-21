package org.example.tranzit;

import lombok.RequiredArgsConstructor;
import org.example.tranzit.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserDTO save(UserDTO userDTO) {
        return toDTO(userRepository.save(toEntity(userDTO)));
    }

    @Override
    public UserDTO getById(Long id) {
        return toDTO(userRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Пользователь не найден")));
    }

    private User toEntity(UserDTO userDTO) {
        return User.builder()
                .id(userDTO.getId())
                .logIn(userDTO.getLogIn())
                .password(userDTO.getPassword())
                .build();
    }

    private UserDTO toDTO(User user) {
        return UserDTO.builder().build();
    }


}
