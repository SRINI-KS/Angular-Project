package com.demo.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.userService;

@RestController
public class userController {

	@Autowired
	private userService userservice;
	
	@GetMapping("users/{username}/{password}")   
	public int userLogin(@PathVariable("userName") String userName1 ,@PathVariable("password") String password1) throws SQLException {
    
	int flag=userservice.loginValidation(userName1, password1);
	if(flag==0) {
		return 0;
	}
	return flag;
}
}
//	@GetMapping("/")   
//	public string userlogin() throws SQLException 
//    
//	
//	
//	return val;
//}
//}

