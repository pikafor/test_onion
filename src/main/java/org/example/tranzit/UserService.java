package org.example.tranzit;

import org.example.tranzit.UserDTO;

public interface UserService {
    UserDTO save(UserDTO userDTO);
    UserDTO getById(Long id);
}
