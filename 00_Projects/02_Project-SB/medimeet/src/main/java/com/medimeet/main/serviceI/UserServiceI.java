package com.medimeet.main.serviceI;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.medimeet.main.entities.User;

public interface UserServiceI {

	//abstract method for saveUser operation
	public User saveUser(String request, MultipartFile profileImage) throws IOException;
	
}
