package com.erp.inventory.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private String name;
    private Integer quantity;
    private Double price;
    private String supplier;
}