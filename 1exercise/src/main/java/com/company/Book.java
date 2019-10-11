package com.company;

import java.util.Objects;

public class Book implements IStorageObject {
    private String id;
    private String name;
    private String year;

    public Book(String id, String name, String year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public void update(String... params) {
        id = (Objects.requireNonNull(
                params[0], "Id cannot be null"));
        name = (Objects.requireNonNull(
                params[1], "Name cannot be null"));
        year = (Objects.requireNonNull(
                params[1], "Name cannot be null"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) &&
                Objects.equals(name, book.name) &&
                Objects.equals(year, book.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, year);
    }

}
