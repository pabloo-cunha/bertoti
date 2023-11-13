package web.fatec.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.fatec.dto.UserDTO;
import web.fatec.entities.ProductModel;
import web.fatec.entities.UserModel;
import web.fatec.repository.UserRepository;
import web.fatec.service.UserService;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public Iterable<UserModel> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public UserModel searchUserById(Long id) {
        Optional<UserModel> user = userRepository.findById(id);
        return user.orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
    }

    @Override
    public UserModel cadasterNewUser(UserDTO userDTO) {
        var newUser = new UserModel();
        BeanUtils.copyProperties(userDTO, newUser);

        newUser.setBirthDate(userDTO.birthday());
        UserModel userExistente = userRepository.searchByCpf(newUser.getCpf());
        if (userExistente != null)
            throw new RuntimeException("CPF já cadastrado!");
        else
            return userRepository.save(newUser);
    }

    @Override
    public UserModel updateProfileUser(Long id, UserDTO userDTO) {
        Optional<UserModel> userBd = userRepository.findById(id);

        if (userBd.isEmpty())
            throw new RuntimeException("Usuario não existente");
        var user = userBd.get();
        BeanUtils.copyProperties(userDTO, user);
        user.setBirthDate(userDTO.birthday());
        return userRepository.save(user);
    }

    @Override
    public void deleteProfileUser(Long id) {
        userRepository.deleteById(id);
    }
}
