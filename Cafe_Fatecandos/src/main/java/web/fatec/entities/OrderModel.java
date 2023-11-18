package web.fatec.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_order;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private ProductModel id_product;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private UserModel id_user;
    private LocalDateTime date_of_order;
    private BigDecimal totalPriceOrder;
    public OrderModel(){
    }

    public OrderModel(UUID id_order, ProductModel productModel, UserModel userModel) {
        this.id_order = id_order;
        this.id_product = productModel;
        this.id_user = userModel;
        this.date_of_order = LocalDateTime.now();

    }
}
