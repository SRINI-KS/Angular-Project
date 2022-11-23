package com.demo.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.demo.dbutil.DButil;
import com.demo.service.userService;

@Service
public class userServiceimpl implements userService {
    int flag=0;
	Connection connection;
	public userServiceimpl() throws SQLException {
		 connection =DButil.getConnection();
	}

	@Override
	public int loginValidation(String username, String password) throws SQLException {
		try {
		PreparedStatement statement =connection.prepareStatement("select * from users where username='"+username+"'");
		 ResultSet rs =statement.executeQuery();
		 while (rs.next()) {
			 if(rs.getString(3).equals(username)&& rs.getString(4).equals(password)) {
				 flag=1;
				 
			 }else {
				 System.out.println("invalid userName / password");
			 }
		 }
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	
	}
	
	

}
