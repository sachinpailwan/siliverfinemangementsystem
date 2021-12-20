package com.pailsom.sfms.model.internal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "t_sfms_assembly_stock")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssemblyStock {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "assembly_stock_seq")
    @SequenceGenerator(name="assembly_stock_seq", sequenceName="assembly_stock_sequence",allocationSize = 1)
    private int id;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "subProductId")
    private List<SubProduct> subProducts;

    private BigDecimal weight;
    private BigDecimal laborCost;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private String del;
}
