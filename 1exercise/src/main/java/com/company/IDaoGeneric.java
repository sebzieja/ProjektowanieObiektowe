package com.company;

import java.util.List;
import java.util.Optional;
//Could be better and remove needing IStorageObject.
public interface IDaoGeneric<T> {
    void save(T t);
    void delete(T t);
    void update(T t, String[] params);
    Optional<T> read(long id);
    List<T> readAll();
}
