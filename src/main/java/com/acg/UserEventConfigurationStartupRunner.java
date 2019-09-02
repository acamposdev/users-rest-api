package com.acg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.acg.service.IUserEvent;
import com.acg.subject.UserSubject;

@Component
public class UserEventConfigurationStartupRunner implements CommandLineRunner {
	
	Logger logger = LoggerFactory.getLogger(UserEventConfigurationStartupRunner.class);
	
    @Autowired
    private UserSubject subject;
    
    @Autowired
    @Qualifier("logMessage")
    private IUserEvent logMessage;
    
	@Autowired
	@Qualifier("emailSender")
    private IUserEvent emailSender;
	
	@Autowired
	@Qualifier("webSocketService")
	private IUserEvent webSocketService;

    @Override
    public void run(String...args) throws Exception {
    	logger.debug("Configurando UserSubject");
    	
    	subject.subscribe(logMessage);
    	subject.subscribe(emailSender);
    	subject.subscribe(webSocketService);
    }
}