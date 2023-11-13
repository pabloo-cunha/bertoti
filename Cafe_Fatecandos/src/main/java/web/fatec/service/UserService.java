package web.fatec.service;

import web.fatec.dto.UserDTO;
import web.fatec.entities.UserModel;

public interface UserService {

    Iterable<UserModel> getAllUser();

    UserModel searchUserById(Long id);

    UserModel cadasterNewUser(UserDTO userDTO);

    UserModel updateProfileUser(Long id, UserDTO userDTO);

    void deleteProfileUser(Long id);
}
