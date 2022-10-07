package com.sklep2.sklepapi2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Product {

    private int id;
    private String name;
    private Float price;
    private int category;
    private String describe;
}
