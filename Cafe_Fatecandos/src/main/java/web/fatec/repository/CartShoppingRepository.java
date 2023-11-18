package web.fatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.fatec.entities.OrderModel;

import java.util.UUID;

public interface CartShoppingRepository extends JpaRepository<OrderModel, UUID> {
}
