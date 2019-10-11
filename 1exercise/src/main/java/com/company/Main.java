package com.company;

public class Main {

    public static void main(String[] args) {
        IDao dao = new DaoList();
        IStorageObject person = new Person("1", "Data", "Tralala");
        dao.save(person);
        IStorageObject book = new Book("2", "Drugi", "1993");
        dao.save(book);
        System.out.println(dao.readAll());
        person.update("4", "Czesc", "Zmiana");
        System.out.println(dao.readAll());
        dao.remove(person);
        System.out.println(dao.readAll());
    }
}
