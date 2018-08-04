package com.tiamaes.demo.service;

import java.util.List;

import javax.annotation.Resource;
import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tiamaes.demo.mapper.UserMapper;
import com.tiamaes.demo.model.User;
@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class UserService implements UserServiceInterface {

	@Resource
	private UserMapper userMapper;
	@Override
	@Transactional(rollbackFor = RuntimeException.class, propagation = Propagation.REQUIRED)
	public List<User> findUser(String name) {
		List<User> user = userMapper.selectBlog(name);
//		User temp = new User();
//		temp.setId(1234);
//		temp.setName("ww");
//		temp.setPassword("12345");
//		userMapper.insertUser(temp);
//		if(true){
//			throw new RuntimeException();
//		}
		return user;
	}
	public void addUser(String name) {
		//List<User> user = userMapper.selectBlog(name);
		User temp = new User();
		temp.setId(1234);
		temp.setName("ww");
		temp.setPassword("12345");
		userMapper.insertUser(temp);
		if(true){
			throw new RuntimeException();
		}
	}

}
