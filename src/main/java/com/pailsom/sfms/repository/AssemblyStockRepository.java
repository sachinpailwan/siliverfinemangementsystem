package com.pailsom.sfms.repository;

import com.pailsom.sfms.model.internal.AssemblyStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssemblyStockRepository extends JpaRepository<AssemblyStock, Long> {
}
