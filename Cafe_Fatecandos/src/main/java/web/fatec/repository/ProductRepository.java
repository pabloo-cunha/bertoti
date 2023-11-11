package web.fatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.fatec.entities.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {

    ProductModel findByTitle(String title);
}
