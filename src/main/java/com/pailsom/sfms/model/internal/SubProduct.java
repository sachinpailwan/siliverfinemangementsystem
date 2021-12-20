package com.pailsom.sfms.model.internal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "t_sfms_sub_product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sub_product_seq")
    @SequenceGenerator(name="sub_product_seq", sequenceName="sub_product_sequence",allocationSize = 1)
    private int id;

    private String name;
    private String type;
    private String subType;
    private BigDecimal fine;
}
