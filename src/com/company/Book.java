package com.company;

import java.util.Objects;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private String isbn;
    private int price;
    private static int edition;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public Book(String title, String author, String isbn, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Book book = (Book) o;
        return this.price == book.price && Objects.equals(this.title, book.title) && Objects.equals(this.author, book.author);
    }

    @Override
    public int hashCode() {
        return price;
    }

    @Override
    public Book clone() {
        return new Book(title, author, isbn, price);
    }


    @Override
    public int compareTo(Book o) {
        return isbn.compareTo(o.isbn);
    }
}
