package patterns.design.patterns.behaviors.observer;

import java.util.ArrayList;

public class DataBaseProducts {
    private ArrayList<Product> products;

    public DataBaseProducts() {
    }

    public DataBaseProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void saveProduct(Product product){
         products.add(product);
    }

    @Override
    public String toString() {
        return "DataBaseProducts{" +
                "products=" + products +
                '}';
    }
}
