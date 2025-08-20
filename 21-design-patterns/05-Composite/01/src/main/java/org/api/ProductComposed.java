package org.api;

import java.util.ArrayList;
import java.util.List;

public class ProductComposed extends ProductComponent {
    private List<ProductComponent> children = new ArrayList<>();

    @Override
    public Double getPrice() {
        return 0.0;
    }
}
