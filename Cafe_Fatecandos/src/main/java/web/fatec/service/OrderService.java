package web.fatec.service;

import web.fatec.dto.OrderDTO;
import web.fatec.entities.OrderModel;
import web.fatec.entities.UserModel;

import java.util.UUID;

public interface OrderService {

    Iterable<OrderModel> getAllOrders();

    OrderModel getOrderByCpf(OrderModel userCpf);

    OrderModel registerOrder(OrderDTO orderDTO);

    void deleteOrder(UUID id_order);
}
