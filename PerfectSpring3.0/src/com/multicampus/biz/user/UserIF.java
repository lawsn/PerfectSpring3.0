package com.multicampus.biz.user;

import com.multicampus.biz.user.vo.UserVO;

public interface UserIF {

	public void addUser(UserVO vo);
	
	public UserVO getUser(UserVO vo);
	
}
