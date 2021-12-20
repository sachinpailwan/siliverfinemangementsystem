package com.pailsom.sfms.repository;

import com.pailsom.sfms.model.internal.ProductStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductStockRepository extends JpaRepository<ProductStock,Long> {

}
