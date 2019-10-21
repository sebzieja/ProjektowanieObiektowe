package com.company;

import java.util.List;
import java.util.Optional;
public interface Dao<T> {
    void save(T t);
    void delete(Long id);
    void update(Long id, String[] params);
    Optional<T> read(long id);
    List<T> readAll();
}