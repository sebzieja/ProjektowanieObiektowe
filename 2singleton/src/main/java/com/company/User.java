package com.company;

public class User {
    Long id;
    String name;
    String surname;
    Integer year;
    Long fine;

    public User(Long id, String name, String surname, Integer year, Long fine) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.fine = fine;
    }

    @Override
    public String toString() {
        return id +
                "," + name +
                "," + surname +
                "," + year +
                "," + fine;
    }
}
