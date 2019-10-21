package com.company;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        SingletonDAO singletonDAO = SingletonDAO.getInstance();
        Dao<Book> bookDao = singletonDAO.readFromFiles(BookDao.class);
        Dao<User> userDao = singletonDAO.readFromFiles(UserDao.class);
        bookDao.delete(1L);
        Optional<User> read = userDao.read(1L);
        userDao.update(1L, new String[]{null, "Bartek", null, null, null});
        singletonDAO.saveToFile(userDao);
        singletonDAO.saveToFile(bookDao);
    }
}
