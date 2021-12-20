package com.pailsom.sfms.service;

import com.pailsom.sfms.model.internal.ProductStock;
import com.pailsom.sfms.repository.ProductStockRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductStockService {

    private final ProductStockRepository  stockRepository;

    public ProductStockService(ProductStockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public List<ProductStock> getProductStock(){
        return stockRepository.findAll();
    }
}
