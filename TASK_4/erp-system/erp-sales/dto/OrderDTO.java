package com.erp.sales.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private Long customerId;
    private Double totalAmount;
    private String status;
}