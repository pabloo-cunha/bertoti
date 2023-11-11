package web.fatec.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.fatec.dto.ProductDTO;
import web.fatec.entities.ProductModel;
import web.fatec.service.impl.ProductServiceImp;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductServiceImp productService;

    @GetMapping
    public ResponseEntity<Iterable<ProductModel>> getAllProduct(){
        return ResponseEntity.status(HttpStatus.OK).body(productService.searchAllProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductModel> getProductById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(productService.searchProductById(id));
    }

    @PostMapping
    public ResponseEntity<ProductModel> saveNewProduct(@RequestBody @Valid ProductDTO product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.addNewProduct(product));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductModel> updateProduct(@PathVariable Long id, @RequestBody @Valid ProductDTO productDTO){

        return ResponseEntity.status(HttpStatus.OK).body(productService.updateProduct(id, productDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
