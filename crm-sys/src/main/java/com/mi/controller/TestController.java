package com.mi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mi.entity.User;
import com.mi.service.UserService;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="",produces="application/json; charset=utf-8")
	@ResponseBody
	public String test() {
		System.out.println("进入test");
		return "test";
	}
	
	@RequestMapping(value="/all",produces="application/json; charset=utf-8")
	public String findall() {
		List<User> list = userService.findAllUser(1, 20);
		for(User user:list) {
			System.out.println(user.toString());
		}
		return "findall";
	}
	
	@RequestMapping(value="/add",produces="application/json; charset=utf-8")
	@ResponseBody
	public String add() {
		System.out.println("进入add");
		User user=new User();
		user.setUserId("123123123");
		user.setPassword("13456");
		user.setUserName("test");
		userService.addUser(user);
		
		return "test";
	}
}
