package com.acg.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.acg.model.User;

@Service("logMessage")
public class LogMessageServiceImpl implements IUserEvent, LogMessageService {
	
	Logger logger = LoggerFactory.getLogger(LogMessageServiceImpl.class);
	
	public void update(User data) {
		logger.info("LogMessageServiceImpl - update() " , data);
	}
}
