package com.Emp_Project.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.Emp_Project.dto.UserRegistrationDto;
import com.Emp_Project.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
