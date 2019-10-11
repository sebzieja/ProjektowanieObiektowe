package com.company;

import java.util.Objects;

public class Person implements IStorageObject {
    private String id;
    private String name;
    private String data;

    public Person(String id, String name, String data) {
        this.id = id;
        this.name = name;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public void delete() {
        id = null;
        name = null;
        data = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) &&
                Objects.equals(name, person.name) &&
                Objects.equals(data, person.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, data);
    }

    @Override
    public void update(String... params) {
        id = (Objects.requireNonNull(
                params[0], "Id cannot be null"));
        name = (Objects.requireNonNull(
                params[1], "Name cannot be null"));
        data = (Objects.requireNonNull(
                params[1], "Name cannot be null"));
    }
}
