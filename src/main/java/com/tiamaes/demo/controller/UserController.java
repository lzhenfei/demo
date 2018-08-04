package com.tiamaes.demo.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tiamaes.demo.model.User;
import com.tiamaes.demo.service.UserServiceInterface;

@RestController
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserServiceInterface userService;
	
	@RequestMapping(value="/getUser",method=RequestMethod.GET)
	public @ResponseBody List<User> userInfo(){
		List<User> user = userService.findUser("ccc");
		return user;
	}
}
