package com.acg.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.acg.model.User;

@Service("emailSender")
public class EmailSenderServiceImpl implements IUserEvent, EmailSenderService {

	Logger logger = LoggerFactory.getLogger(EmailSenderServiceImpl.class);
	
	@Override
	public void update(User user) {
		logger.info("EmailSenderServiceImpl - update() " + user);
	}

}
