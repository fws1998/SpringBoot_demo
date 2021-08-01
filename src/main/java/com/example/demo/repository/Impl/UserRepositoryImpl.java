package com.example.demo.repository.Impl;

import com.example.demo.eneity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static Map<Integer, User> map;

    static {
        map = new HashMap<>();
        map.put(1, new User(1, "zhangsan"));
        map.put(2, new User(2, "lisi"));
        map.put(3, new User(3, "wanghu"));
    }


    @Override
    public Collection<User> findAll() {
        return map.values();
    }

    @Override
    public User findById(Integer id) {
        return map.get(id);
    }

    @Override
    public void save(User user) {
        map.put(user.getId(), user);
    }

    @Override
    public void deleteById(Integer id) {
        map.remove(id);
        System.out.println("invoked repo");
    }

    @Override
    public void update(User user) {
        map.replace(user.getId(), user);
    }
}
