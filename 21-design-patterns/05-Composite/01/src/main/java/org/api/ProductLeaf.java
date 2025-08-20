package org.api;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductLeaf extends ProductComponent {
    private String name;
    private Double price;


    public ProductLeaf(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
