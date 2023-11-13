package web.fatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.fatec.entities.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    UserModel searchByCpf(String cpf);
}
