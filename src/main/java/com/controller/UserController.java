package com.controller;

import com.entity.Sex;
import com.entity.User;
import com.redis.RedisUtil;
import com.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Paser on 2019/3/5.
 */
@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserServiceImpl userServiceImpl;

    @RequestMapping("/getUserByName")
    @ResponseBody
    public User getUserByName(HttpServletRequest request, Model model){
        if(request.getParameter("name")==null){
            return null;
        }
        return userServiceImpl.queryByUserName(request.getParameter("name"));
    }
    @RequestMapping("/insert")
    @ResponseBody
    public String insert(HttpServletRequest request){
        String name=request.getParameter("name");
        int age=Integer.parseInt(request.getParameter("age"));
        Sex sex=Sex.get(Integer.valueOf(request.getParameter("sex")));
        User user=new User();
        user.setName(name);
        user.setAge(age);
        user.setSex(sex);
        userServiceImpl.insert(user);
        return "Success";
    }
    @RequestMapping("/count")
    @ResponseBody
    public int cout(HttpServletRequest request){
        String age=request.getParameter("age");
        return userServiceImpl.coutAgeBigger(Integer.valueOf(age));
    }
}
