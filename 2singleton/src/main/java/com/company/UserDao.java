package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserDao implements Dao<User> {
    private List<User> userList = new ArrayList<>();
    @Override
    public void save(User user) {
        userList.add(user);
    }

    @Override
    public void delete(Long id) {
        userList = userList.stream().filter(user -> !user.id.equals(id)).collect(Collectors.toList());
    }

    @Override
    public void update(Long id, String[] params) {
        userList.stream().filter(user -> user.id.equals(id)).findAny().ifPresent(user -> {
            user.id = Objects.nonNull(params[0]) ? Long.parseLong(params[0]) : user.id;
            user.name = Objects.nonNull(params[1]) ? params[1] : user.name;
            user.surname = Objects.nonNull(params[2]) ? params[2] : user.surname;
            user.year = Objects.nonNull(params[3]) ? Integer.parseInt(params[3]) : user.year;
            user.fine = Objects.nonNull(params[4]) ? Long.parseLong(params[4]) : user.fine;
        });
    }


    @Override
    public Optional<User> read(long id) {
        return userList.stream().filter(user -> user.id.equals(id)).findAny();
    }

    @Override
    public List<User> readAll() {
        return userList;
    }
}
