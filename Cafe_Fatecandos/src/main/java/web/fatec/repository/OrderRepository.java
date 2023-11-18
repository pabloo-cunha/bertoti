package web.fatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import web.fatec.entities.OrderModel;
import web.fatec.entities.UserModel;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<OrderModel, UUID> {

    OrderModel getOrderByCpf(String userCpf);
}
