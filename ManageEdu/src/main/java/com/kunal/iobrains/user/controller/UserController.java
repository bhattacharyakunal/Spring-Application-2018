package com.kunal.iobrains.user.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kunal.iobrains.user.model.User;
import com.kunal.iobrains.user.util.UserConstants;

@RestController
public class UserController {
	
	@RequestMapping(method=RequestMethod.POST,value="/validateuser")
	public String isValidUser(@RequestBody User user) {
		String isValid=UserConstants.USER_VALIDATION_FAILURE_MESSAGE;
			if(user.getUserName().equalsIgnoreCase("kunal") && user.getPassword().equalsIgnoreCase("1234")) {
				isValid=UserConstants.USER_VALIDATION_SUCCESS_MESSAGE;
			}
		return isValid;
	}
}
