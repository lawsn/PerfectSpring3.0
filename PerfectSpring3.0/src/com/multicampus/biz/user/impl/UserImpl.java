package com.multicampus.biz.user.impl;

import com.multicampus.biz.user.UserIF;
import com.multicampus.biz.user.impl.dao.UserDAO;
import com.multicampus.biz.user.vo.UserVO;

public class UserImpl implements UserIF {

	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public void addUser(UserVO vo) {
		userDAO.addUser(vo);
	}
	
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

}
