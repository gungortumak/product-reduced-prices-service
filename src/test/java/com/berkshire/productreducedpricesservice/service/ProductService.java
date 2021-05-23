package com.berkshire.productreducedpricesservice.service;

import com.berkshire.productreducedpricesservice.controller.ProductReducedDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<ProductReducedDTO> getReducedPriceProducts();
}
