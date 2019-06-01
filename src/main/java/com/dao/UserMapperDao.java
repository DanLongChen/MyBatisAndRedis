package com.dao;

import com.entity.User;
import org.apache.catalina.realm.UserDatabaseRealm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by Paser on 2019/3/4.
 */
@Component
public interface UserMapperDao{
    public User findByName(String name);
    public User findByMap(Map map);
    public User findByAn(@Param("name")String name,@Param("sex") String sex);
    public void insert(User user);
    public void updateUser(User user);
    public void delete(int id);
}
