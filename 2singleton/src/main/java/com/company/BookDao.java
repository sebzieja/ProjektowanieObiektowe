package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookDao implements Dao<Book> {
    private List<Book> bookList = new ArrayList<>();

    @Override
    public void save(Book book) {
        bookList.add(book);
    }

    @Override
    public void delete(Long id) {
        bookList = bookList.stream().filter(book -> !book.id.equals(id)).collect(Collectors.toList());
    }

    @Override
    public void update(Long id, String[] params) {
        bookList.stream().filter(book -> book.id.equals(id)).findAny().ifPresent(book -> {
            book.id = Objects.nonNull(params[0]) ? Long.parseLong(params[0]) : book.id;
            book.title = Objects.nonNull(params[1]) ? params[2] : book.title;
            book.author = Objects.nonNull(params[2]) ? params[2] : book.author;
            book.userId = Objects.nonNull(params[3]) ? params[3] : book.userId;
        });
    }

    @Override
    public Optional<Book> read(long id) {
        return bookList.stream().filter(book -> book.id.equals(id)).findAny();
    }

    @Override
    public List<Book> readAll() {
        return bookList;
    }
}
