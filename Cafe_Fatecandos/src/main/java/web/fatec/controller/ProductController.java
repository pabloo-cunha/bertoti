package web.fatec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import web.fatec.repository.ProductRepository;

@RestController
public class ProductController {

    @Autowired
    ProductRepository prodRep;

//        @PostMapping
//        public ResponseEntity<ProductModel> saveProduct(@RequestBody @Valid ProductDTO)
//            return null;
//        }

}
