package com.restBloggingApp.main.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restBloggingApp.main.dto.UserDTO;
import com.restBloggingApp.main.entity.User;
import com.restBloggingApp.main.exception.UserAlreadyExistedException;
import com.restBloggingApp.main.exception.UserNotFoundException;
import com.restBloggingApp.main.repo.UserRepository;
import com.restBloggingApp.main.serviceI.UserServiceI;


@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public UserDTO addUser(UserDTO userDTO) {
		// check first user is already present or not with provided emailId
		User userByEmailId = this.userRepository.findByEmailId(userDTO.getEmailId());
		
		// convert into Optional to check is present or not
		Optional<User> optionalUserByEmailId = Optional.ofNullable(userByEmailId);
		
		if(optionalUserByEmailId.isPresent()) {
			// if present then throw error
			throw new UserAlreadyExistedException();
		}
		else {
			// if not found then perform save operation
			User savedUser = this.userRepository.save(this.userDtoToUser(userDTO));
			
			return this.userToUserDto(savedUser);
			
		}
	}
	
	
	// blogic for getAllUsers()
	@Override
	public List<UserDTO> getAllUsers() {
		// check is there any users in our database.
		List<User> allUsersList = this.userRepository.findAll();
		
		// if users are not available then throw error
		if(allUsersList.isEmpty()) {
			throw new UserNotFoundException();
		}
		else {
			// if users found
			// need to convert user list into user dto list
			List<UserDTO> userDtoList = new ArrayList<UserDTO>();			
			
			allUsersList.forEach(user->{
				userDtoList.add(this.userToUserDto(user));
			});
			
			return userDtoList;	
		}
	}
	
	
	// blogic for getUserByUserId()
	@Override
	public UserDTO getUserByUserId(Integer userId) {
		// check is user available of provided userId
		Optional<User> userById = this.userRepository.findById(userId);
		
		if(userById.isEmpty()) {
			// if user not found then throw error
			throw new UserNotFoundException();
		}
		else {
			//if found then convert user into userdto and return
			UserDTO userDto = this.userToUserDto(userById.get());
			
			return userDto;
		}
	}
	
	
	// blogic for getUserByEmailId()
	@Override
	public UserDTO getUserByEmailId(String emailId) {
		// check is user available in database having provided emailId
		User userByEmailId = this.userRepository.findByEmailId(emailId);
		
		// convert userByEmailId into Optional --> to check present or empty
		Optional<User> optionalUserByEmailId = Optional.ofNullable(userByEmailId);
		
		if(optionalUserByEmailId.isEmpty()) {
			// if not found then throw error
			throw new UserNotFoundException();
		}
		else {
			// if found then convert into userDto and return
			UserDTO userDto = this.userToUserDto(optionalUserByEmailId.get());
			
			return userDto;
		}
	}
	
	
	// blogic for updateUserById()
	@Override
	public UserDTO updateUserById(UserDTO userDto, Integer userId) {
	
		// need to find user using provided id. if available then do updation else throw error
		Optional<User> userById = this.userRepository.findById(userId);
		
		if(userById.isEmpty()) {
			// if not found
			throw new UserNotFoundException();
		}
		else{
			// if found then do updation
			// need to convert userDto into user
			User user = this.userDtoToUser(userDto);
			
			userById.get().setName(user.getName());
			userById.get().setEmailId(user.getEmailId());
			userById.get().setPassword(user.getPassword());
			userById.get().setAbout(user.getAbout());
			
			// need to save updated user in database
			this.userRepository.save(userById.get());
			
			// to return we need an UserDTO --> convert user into userDto
			UserDTO updatedUser = this.userToUserDto(user);
			
			return updatedUser;
		}
	}
	
	// blogic to deleteUserByUserId()
	@Override
	public UserDTO deleteUserByUserId(Integer userId) {
		// check is user available in database having provided userdId
		Optional<User> userById = this.userRepository.findById(userId);
		
		if(userById.isEmpty()) {
			// if user not found then throw error
			throw new UserNotFoundException();
		}
		else {
			// if user found then delete that user and return deleted user
			this.userRepository.deleteById(userId);
			
			// to return need to convert userById into userDto
			UserDTO deletedUserDto = this.userToUserDto(userById.get());
			
			return deletedUserDto;
		}
	}
	
	// blogic for deleteUserByEmailId()
	@Override
	public UserDTO deleteUserByEmailId(String emailId) {
		// check is user available in database having provided emailId
		User userByEmailId = this.userRepository.findByEmailId(emailId);
		
		// convert userByEmailId in Optional to check is present or not
		Optional<User> optionalUserByEmailId = Optional.ofNullable(userByEmailId);
		
		if(optionalUserByEmailId.isEmpty()) {
			// if not found then throw error
			throw new UserNotFoundException();
		}
		else {
			// if found then delete that user and return deleted user 
			this.userRepository.delete(optionalUserByEmailId.get());
			
			// to return need to convert user into userDto
			UserDTO deletedUser = this.userToUserDto(optionalUserByEmailId.get());
		
			return deletedUser;
		}
	}
	
	
	// method to map UserDTO to User
	private User userDtoToUser(UserDTO userDTO) {
		/*
		 * Before using ModelMapper :
		 * 
		 * User user = new User();
		 * 
		 * user.setUserIdentifier(userDTO.getUserIdentifier());
		 * user.setName(userDTO.getName()); user.setEmailId(userDTO.getEmailId());
		 * user.setPassword(userDTO.getPassword()); user.setAbout(userDTO.getAbout());
		 */
		
		//After using ModelMapper :	
		User user = this.modelMapper.map(userDTO, User.class);
		
		return user;
	}
	
	// method to convert User to UserDTO
	private UserDTO userToUserDto(User user) {
		/*
		 * Before using ModelMapper :
		 * 
		 * UserDTO userDTO = new UserDTO();
		 * 
		 * userDTO.setUserIdentifier(user.getUserIdentifier());
		 * userDTO.setName(user.getName()); userDTO.setEmailId(user.getEmailId());
		 * userDTO.setPassword(user.getPassword()); userDTO.setAbout(user.getAbout());
		 */
		
		// After using ModelMapper :
		UserDTO userDTO = this.modelMapper.map(user, UserDTO.class);
		
		return userDTO;
	}
}



