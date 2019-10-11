package com.company;

import java.util.List;

public interface IDao {
    public void save(IStorageObject iStorageObject);
    public IStorageObject read(int id);
    public void remove(IStorageObject iStorageObject);
    public List<IStorageObject> readAll();
}
