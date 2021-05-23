package com.berkshire.productreducedpricesservice.controller;

import com.berkshire.productreducedpricesservice.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);


    /**
     *
     * get reduced priced products
     * @param getReducedPriceProducts
     *
     */
    @GetMapping
    public ResponseEntity getReducedPriceProducts() {
        List<ProductReducedDTO> productReducedDTOList = productService.getReducedPriceProducts();

        return ResponseEntity
                .ok()
                .body(productReducedDTOList);
    }

}
