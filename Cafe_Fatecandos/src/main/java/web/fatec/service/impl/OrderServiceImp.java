package web.fatec.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.fatec.dto.OrderDTO;
import web.fatec.entities.OrderModel;
import web.fatec.entities.UserModel;
import web.fatec.repository.OrderRepository;
import web.fatec.service.OrderService;

import java.util.UUID;
@Service
public class OrderServiceImp implements OrderService {

    @Autowired
    OrderRepository orderRepository;
    @Override
    public Iterable<OrderModel> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public OrderModel getOrderByCpf(OrderModel userCpf) {
        return orderRepository.getOrderByCpf(userCpf.getId_user().getCpf());
    }

    @Override
    public OrderModel registerOrder(OrderDTO orderDTO) {
        var newOrder = new OrderModel();
        BeanUtils.copyProperties(orderDTO, newOrder);
        newOrder.setDate_of_order(newOrder.getDate_of_order());
        return orderRepository.save(newOrder);
    }

    @Override
    public void deleteOrder(UUID id_order) {
        orderRepository.deleteById(id_order);
    }
}
