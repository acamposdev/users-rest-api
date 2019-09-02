package com.acg.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acg.model.User;
import com.acg.subject.UserSubject;

@RestController
@RequestMapping("/users")
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserSubject subject;


	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public User find(@PathVariable("userId") String id) {

		User user = new User(id, id);

		subject.notifyAllObservers(user);

		return user;
	}
}
