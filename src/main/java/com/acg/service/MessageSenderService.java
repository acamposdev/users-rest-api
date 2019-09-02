package com.acg.service;

import com.acg.model.Message;

public interface MessageSenderService {
	public void sendMessageToUser(String destination, Message message);
}
