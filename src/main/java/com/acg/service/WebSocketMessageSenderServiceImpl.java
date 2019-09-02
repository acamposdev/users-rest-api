package com.acg.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.acg.model.Message;
import com.acg.model.User;

@Service("webSocketService")
public class WebSocketMessageSenderServiceImpl implements IUserEvent, MessageSenderService {
	
	Logger logger = LoggerFactory.getLogger(WebSocketMessageSenderServiceImpl.class);

	@Autowired
	private SimpMessagingTemplate webSocket;
	
	@Override
	public void sendMessageToUser(String destination, Message message) {
		webSocket.convertAndSend(destination, message);
	}

	@Override
	public void update(User user) {
		sendMessageToUser("/topic/greetings/" + user.getName(), new Message(user.getName()));
	}

}
