package com.example;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest  //springboot整合单元测试的注解
class SpringbootMybatiesQuickstartApplicationTests {

	//自动装配
	@Autowired
	private UserMapper userMapper;


	@Test
	public void testListUser(){
		//将查询到的数据 放到 userList里，之后通过 foreach遍历输出
		List<User> userList=userMapper.list();
		userList.stream().forEach(user -> {
			System.out.println(user);
		});

	}
}
