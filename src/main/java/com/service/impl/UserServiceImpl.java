package com.service.impl;

import com.dao.UserMapperDao;
import com.entity.User;
import com.redis.RedisUtil;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Paser on 2019/3/4.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapperDao dao;
    @Autowired
    RedisUtil redisUtil;
    @Override
    public User queryByUserName(String name) {
        if(redisUtil.get(name)!=null){
            System.out.println("from redis");
            return (User) redisUtil.get(name);
        }else{
            User user=dao.findByName(name);
            redisUtil.set(name,user);
            return user;
        }
    }

    @Override
    @Transactional//开启事务
    public void insert(User user) {
        dao.insert(user);
        String a=null;
//        a.indexOf(9);
    }

    @Override
    public void updateUser(User user) {
        dao.updateUser(user);
    }

    @Override
    public void deleteUser(int id) {
        dao.delete(id);
    }
}
