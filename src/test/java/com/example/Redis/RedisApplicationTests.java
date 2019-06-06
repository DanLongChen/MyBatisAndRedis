package com.example.Redis;

import com.entity.Sex;
import com.entity.User;
import com.redis.RedisUtil;
import com.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {
	@Autowired
	RedisUtil redisUtil;
	@Autowired
	UserServiceImpl userService;
	@Test
	public void contextLoads() {
//		redisUtil.set("name",123);
//		System.out.println(redisUtil.get("message"));
//		redisUtil.set("value","haha");
		User user=new User();
//		user.setUserId(1);
		user.setName("Li");
		user.setAge(100);
		user.setSex(Sex.Man);
		userService.insert(user);
	}

}
