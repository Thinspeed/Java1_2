package com.company;

import java.util.Objects;

public class ProgrammerBook extends Book {

    private String language;
    private int level;

    public ProgrammerBook(String language, int level, String title, String author, String isbn, int price) {
        super(title, author, isbn, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString() {
        return language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        ProgrammerBook book = (ProgrammerBook) o;
        return this.level == book.level && Objects.equals(this.language, book.language);
    }

    @Override
    public int hashCode() {
        return level;
    }
}
