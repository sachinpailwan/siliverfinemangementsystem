package com.pailsom.sfms.model.internal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "t_sfms_product_stock")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductStock {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_stock_seq")
    @SequenceGenerator(name="product_stock_seq", sequenceName="product_stock_sequence",allocationSize = 1)
    private int id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "productId")
    private Product product;

    private BigDecimal weight;
    private BigDecimal laborCost;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private String del;
}
