package com.restBloggingApp.main.serviceI;

import java.util.List;

import com.restBloggingApp.main.dto.UserDTO;

public interface UserServiceI {

	// declaration of method to add new user
	UserDTO addUser(UserDTO userDTO);
	
	// declaration of method to get all users
	List<UserDTO> getAllUsers();
	
	// declaration of method to get user by provided userId
	UserDTO getUserByUserId(Integer userId);
	
	// declaration of method to get user by provided emailId
	UserDTO getUserByEmailId(String emailId);

	// declaration of method to update user by using userId
	UserDTO updateUserById(UserDTO userDto ,Integer userId);
	
	// declaration of method to delete user by provided userId
	UserDTO deleteUserByUserId(Integer userId);
	
	// declaration of method to delete user by provided emailId
	UserDTO deleteUserByEmailId(String emailId);
	
}
