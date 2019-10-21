package com.company;

import java.io.*;
import java.net.URL;
import java.util.List;

public class SingletonDAO {
    private static SingletonDAO singletonDAO;

    private SingletonDAO() {
    }

    synchronized public static SingletonDAO getInstance() {
        if (singletonDAO == null) {
            singletonDAO = new SingletonDAO();
        }
        return singletonDAO;
    }

    public <T> Dao readFromFiles(Class<T> instance) {
        URL book = singletonDAO.getClass().getResource("book.csv");
        URL user = singletonDAO.getClass().getResource("user.csv");

        if (instance == BookDao.class) {
            BookDao bookDao = new BookDao();
            try (
                    BufferedReader reader = new BufferedReader(new FileReader(book.getFile()));
            ) {
                String line;
                String split = ",";
                reader.readLine();
                while ((line = reader.readLine()) != null) {
                    String[] params = line.split(split);
                    bookDao.save(new Book(Long.parseLong(params[0]), params[1], params[2], params[3]));
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found:" + e);
            } catch (IOException e) {
                System.out.println("IOException while reading file:" + e);
            }
            return bookDao;
        } else if (instance == UserDao.class) {
            UserDao userDao = new UserDao();
            try (
                    BufferedReader reader = new BufferedReader(new FileReader(user.getFile()));
            ) {
                String line;
                String split = ",";
                reader.readLine();
                while ((line = reader.readLine()) != null) {
                    String[] params = line.split(split);
                    userDao.save(new User(Long.parseLong(params[0]), params[1], params[2], Integer.parseInt(params[3]), Long.parseLong(params[4])));
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found:" + e);
            } catch (IOException e) {
                System.out.println("IOException while reading file:" + e);
            }
            return userDao;
        }
        return null;
    }

    public void saveToFile(Dao dao) {
        if (dao instanceof BookDao) {
            URL url = singletonDAO.getClass().getResource("book.csv");
            try (
                    BufferedWriter writer = new BufferedWriter(new FileWriter(url.getFile()))
            ) {
                writer.write("Books:\n");
                for (Book book : (List<Book>) dao.readAll()) {
                    writer.write(book.toString());
                    writer.write("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        if (dao instanceof UserDao) {
            URL url = singletonDAO.getClass().getResource("user.csv");
            try (
                    BufferedWriter writer = new BufferedWriter(new FileWriter(url.getFile()))
            ) {
                writer.write("Users:\n");
                for (User user : (List<User>) dao.readAll()) {
                    writer.write(user.toString());
                    writer.write("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
