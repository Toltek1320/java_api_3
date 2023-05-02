package org.example.sem3.hw2;

public class Product {
    public String name;
    public String country;
    public double weight;
    public int price;
    public int sort;

    public Product(String name, String country, double weight, int price, int sort) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", sort=" + sort +
                '}';
    }
}