package org.example.sem3.hw3;
// Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
// Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
// и год издания после 2010 г, включительно.
import java.util.ArrayList;
public class Hw3 {
    public static String[] findBooks(Book[] books) {
        ArrayList<String> bookTitles = new ArrayList<String>();
        for (Book book : books) {
            if (isPrime(book.getPagesCount()) && book.getAuthor().contains("А")
                    && book.getYear() >= 2010) {
                bookTitles.add(book.getTitle());
            }
        }
        return bookTitles.toArray(new String[bookTitles.size()]);
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book("Крым", "Астафьев", 15.99, 2011, 617),
                new Book("Стихи", "Ахматова", 9.99, 2012, 47),
                new Book("Норильск", "Львов", 7.99, 1996, 270),
                new Book("Путь Воина", "Кастанеда", 12.99, 1992, 320),
                new Book("Математика Майя", "Аргуэльес", 11.99, 2011, 1567)
        };
        String[] titles = findBooks(books);
        if (titles.length == 0) {
            System.out.println("Книг по заданным критериям не найдено.");
            return;
        }
        System.out.println("Найдены следующие книги по заданным критериям:");
        for (String title : titles) {
            System.out.println(title);
        }
    }
}

