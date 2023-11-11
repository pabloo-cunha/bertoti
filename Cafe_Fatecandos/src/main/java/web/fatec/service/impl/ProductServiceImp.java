package web.fatec.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.fatec.dto.ProductDTO;
import web.fatec.entities.ProductModel;
import web.fatec.repository.ProductRepository;
import web.fatec.service.ProductService;

import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    ProductRepository pr;
    @Override
    public Iterable<ProductModel> searchAllProducts() {
        return pr.findAll();
    }

    @Override
    public ProductModel searchProductById(Long id) {
        Optional<ProductModel> product = pr.findById(id);
        return product.orElseThrow(() -> new RuntimeException("Produto não existe"));
    }

    @Override
    public ProductModel addNewProduct(ProductDTO newProduct) {
        var productModel = new ProductModel();
        BeanUtils.copyProperties(newProduct, productModel);

        ProductModel productExistente = pr.findByTitle(productModel.getTitle());
        if (productExistente != null)
            throw new RuntimeException("Esse titulo já existe!");
        else
            return pr.save(productModel);
    }

    @Override
    public ProductModel updateProduct(Long id, ProductDTO productDTO) {
        Optional<ProductModel> productBd = pr.findById(id);

        if (productBd.isEmpty())
            throw new RuntimeException("Produto não existente");
        var product = productBd.get();
        BeanUtils.copyProperties(productDTO, product);
        return pr.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        pr.deleteById(id);
    }
}
