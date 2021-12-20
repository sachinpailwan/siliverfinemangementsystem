package com.pailsom.sfms.controller;
import com.pailsom.sfms.model.internal.ProductStock;
import com.pailsom.sfms.service.ProductStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin()
public class StockController {

    @Autowired
    private ProductStockService productStockService;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String getEmployees() {
        return "Welcome!";
    }

    @RequestMapping(value = "/productstock",method = RequestMethod.GET)
    public List<ProductStock> getProductStock(){
        return productStockService.getProductStock();
    }


}