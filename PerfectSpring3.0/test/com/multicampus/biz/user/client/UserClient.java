package com.multicampus.biz.user.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.multicampus.biz.user.UserIF;
import com.multicampus.biz.user.vo.UserVO;

public class UserClient {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserIF user = (UserIF)factory.getBean("user");

		UserVO add = new UserVO();
		add.setId("doo");
		add.setName("두");
		add.setPassword("gle");
		add.setRole("Developer");
		user.addUser(add);
		
		UserVO find = new UserVO();
		find.setId("doo");
		user.getUser(find);
		
	}
}
