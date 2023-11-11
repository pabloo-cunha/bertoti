package web.fatec.service;

import web.fatec.dto.ProductDTO;
import web.fatec.entities.ProductModel;

public interface ProductService {

    Iterable<ProductModel> searchAllProducts();

    ProductModel searchProductById(Long id);

    ProductModel addNewProduct(ProductDTO newProduct);

    ProductModel updateProduct(Long id, ProductDTO productDTO);

    void deleteProduct(Long id);
}
