package org.example.sem3.hw2;
// Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
// Получить наименования товаров заданного сорта с наименьшей ценой.
import java.util.ArrayList;
public class Hw2{
    public static String[] getProductsOfMinSortAndPrice(Product[] products, int sort) {
        ArrayList<String> product_names = new ArrayList<String>();

        int min_price = Integer.MAX_VALUE;
        for (Product product : products) {
            if (product.getSort() == sort && product.getPrice() < min_price) {
                min_price = product.getPrice();
            }
        }
        for (Product product : products) {
            if (product.getSort() == sort && product.getPrice() == min_price) {
                product_names.add(product.getName());
            }
        }
        return product_names.toArray(new String[0]);
    }
    public static void main(String[] args) {
        Product[] products = {
                new Product("Гречка", "Россия", 0.2, 50, 1),
                new Product("Картошка", "Беларусь", 0.1, 40, 1),
                new Product("Рис", "Китай", 0.3, 30, 2),
                new Product("Свекла", "Беларусь", 0.3, 30, 2),
                new Product("Морковь", "Россия", 0.3, 30, 2),
                new Product("Яблоки", "Россия", 0.3, 70, 2),
                new Product("Редька", "Беларусь", 0.4, 30, 2)};
        int sort = 2;
        String[] names = getProductsOfMinSortAndPrice(products, sort);
        if (names.length == 0) {
            System.out.println("Товаров заданного сорта не найдено.");
            return;
        }
        System.out.println("Наименования товаров заданного сорта с наименьшей ценой:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

