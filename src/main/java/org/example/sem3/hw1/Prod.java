package org.example.sem3.hw1;

public class Prod {
    public String name;
    public int sort;
    public int prices;

    @Override
    public String toString() {
        return "Prod{" +
                "name='" + name + '\'' +
                ", sort=" + sort +
                ", price=" + prices +
                '}';
    }
    public Prod(String name, int sort, int prices) {
        this.name = name;
        this.sort = sort;
        this.prices = prices;
    }
}



