package org.api;

public abstract class ProductComponent {

    public abstract Double getPrice();
    public void add(ProductComponent product) {};
    public void remove(ProductComponent product) {};
}
