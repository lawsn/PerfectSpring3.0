package com.multicampus.biz.user.impl.dao;

import com.multicampus.biz.user.vo.UserVO;

public class UserDAO {

	public void addUser(UserVO vo) {
		System.out.println("=== addUser() 호출");
		System.out.println(vo + " 추가합니다.");
	}
	
	public UserVO getUser(UserVO vo) {
		System.out.println("=== getUser() 호출");
		System.out.println(vo.getId() + "(을)를 찾습니다.");
		return vo;
	}
}
