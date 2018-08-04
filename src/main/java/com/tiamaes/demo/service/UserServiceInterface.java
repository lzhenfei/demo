package com.tiamaes.demo.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tiamaes.demo.model.User;

public interface UserServiceInterface {
	List<User> findUser(String name);
}
