package entities;

import exception.NotZeroException;

public class Product {
    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public Product(){

    }

    public Product(String name, Double price) {
        if (name == null || price == null){
            throw new IllegalArgumentException("Product name and price não podem ser nulos");
        }
        else if (price <= 0){
            throw  new NotZeroException();
        }
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
