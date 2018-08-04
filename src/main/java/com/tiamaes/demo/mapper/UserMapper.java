package com.tiamaes.demo.mapper;



import java.util.List;

import com.tiamaes.demo.model.User;

public interface UserMapper {

	public List<User> selectBlog(String name);
	public void insertUser(User user);
}
