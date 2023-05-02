package org.example.sem3.hw1;
// Дан массив записей: наименование товара, цена, сорт.
// Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
import java.util.ArrayList;
import java.util.List;

public class Hw1 {
    public static void main(String[] args) {
        List<Prod> prods = GetProd();
        int maxPrice = 0;
        for (Prod prod : prods) {
            if (prod.name.contains("hi") && (prod.sort == 1) || prod.sort == 2){
                int currentPrice =  prod.prices;
                if (currentPrice > maxPrice) {
                    maxPrice = currentPrice;
                }
            }
        }
        System.out.println("Наибольшая цена среди товаров, соответствующих условиям: " + maxPrice);
    }

    public static List<Prod> GetProd() {
        List<Prod> prod = new ArrayList<Prod>();
        prod.add(new Prod("mid", 1, 10));
        prod.add(new Prod("hi", 1, 20));
        prod.add(new Prod("hi", 2, 30));
        prod.add(new Prod("hi", 3, 60));
        prod.add(new Prod("hi", 2, 40));
        prod.add(new Prod("hi", 2, 50));

        return prod;
    }
}


