package com.company;

import java.util.ArrayList;
import java.util.List;

public class DaoList implements IDao {
    private List<IStorageObject> storageObjects = new ArrayList<>();

    public void save(IStorageObject iStorageObject) {
        storageObjects.add(iStorageObject);
    }

    public IStorageObject read(int index) {
        return storageObjects.get(index);
    }
    public List<IStorageObject> readAll() {
        return storageObjects;
    }

    public void remove(IStorageObject iStorageObject) {
        storageObjects.remove(iStorageObject);
    }
}
