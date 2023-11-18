package web.fatec.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.fatec.dto.OrderDTO;
import web.fatec.entities.OrderModel;
import web.fatec.service.impl.OrderServiceImp;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderServiceImp orderService;

    @GetMapping
    public ResponseEntity<Iterable<OrderModel>> getAllOrders(){
        return ResponseEntity.status(HttpStatus.OK).body(orderService.getAllOrders());
    }

    @GetMapping("/{userCpf}")
    public ResponseEntity<OrderModel> getOrderByCpf(@PathVariable @Valid OrderModel userCpf){
        return ResponseEntity.status(HttpStatus.OK).body(userCpf);
    }

    @PostMapping
    public ResponseEntity<OrderModel> registerOrder(@RequestBody OrderDTO orderDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(orderService.registerOrder(orderDTO));
    }


}
