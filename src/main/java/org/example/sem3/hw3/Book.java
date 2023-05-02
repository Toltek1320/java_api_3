package org.example.sem3.hw3;

public class Book {
    public String title;
    public String author;
    public double price;
    public int year;
    public int pages;

    public Book(String title, String author, double price, int year, int pages) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPagesCount() {
        return pages;
    }

    @Override
    public String toString() {
        return title + " (" + author + "), " + year + ", " + pages + " pages, " + price + "$";
    }
}


