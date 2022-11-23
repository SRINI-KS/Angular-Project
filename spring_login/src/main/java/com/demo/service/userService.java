package com.demo.service;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository

public interface userService {
	
	public int loginValidation(String userName ,String password) throws SQLException;
	

}
