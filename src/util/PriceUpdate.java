package util;

import model.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        // Aumentando o preço do produto em 10%
        p.setPrice(p.getPrice() * 1.1);
    }
}
