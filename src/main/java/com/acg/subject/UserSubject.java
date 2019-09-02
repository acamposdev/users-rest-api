package com.acg.subject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.acg.model.User;
import com.acg.service.IUserEvent;

@Service("subject")
public class UserSubject {
	
	public static List<IUserEvent> observers = new ArrayList<IUserEvent>();
	
	public void subscribe(IUserEvent userEvent) {
		observers.add(userEvent);
	}
	
	public void notifyAllObservers(User user) {
		observers.forEach((obj) -> obj.update(user));
	}
}
