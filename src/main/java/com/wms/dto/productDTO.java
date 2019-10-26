package com.wms.dto;

import lombok.Data;

@Data
public class productDTO {
    private Integer id;
    private String name;
    private Double price;
    private Integer min;
    private Integer max;
    private String unit;
    private String warehouse;
    private String category;
    private String standards;
    private Integer storage;
}
