package com.service;

import com.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Paser on 2019/3/4.
 */
@Component
public interface UserService {
    public User queryByUserName(String name);
    public void insert(User user);
    public void updateUser(User user);
    public void deleteUser(int id);
    public int coutAgeBigger(int age);
}
