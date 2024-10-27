package com.web.helpers;

import com.bo.User;
import jakarta.servlet.ServletContext;

import java.util.List;

/**
 *
 * 
 * @author T.BOUDAA
 *
 */
public class GameContextManagement  {

	private ServletContext context;

	private static GameContextManagement instance;

	private GameContextManagement(ServletContext conext) {
		this.context = conext;
	}

	synchronized public static final GameContextManagement getInstance(ServletContext context) {
		if (instance == null) {
			instance = new GameContextManagement(context);
		}
		return instance;
	}

	public List<User> getAllUsers() {
		return (List<User>) context.getAttribute("users");

	}

	public void updateScore(User user) {
		List<User> users = getAllUsers();
		for (User it : users) {
			if (it.getUsername().equals(user.getUsername()) && user.getScore()>it.getHighScore()) {
				it.setHighScore(user.getHighScore());
				break;
			}
		}

	}

	public void insertUser(User user) {
		List<User> userList = (List<User>) context.getAttribute("users");

		userList.add(user);

	}

	public User getUserByLogin(String username) {
		List<User> users = getAllUsers();
		for (User it : users) {
			System.out.println(it);
			if (it.getUsername().equals(username)) {
				return it;
			}
		}

		return null;
	}
	public User getUserByEmail(String email) {
		List<User> users = getAllUsers();
		for (User it : users) {
			System.out.println(it);
			if (it.getEmail().equals(email)) {
				return it;
			}
		}

		return null;
	}

	public void updateUserPassword(String email, String password){
		List<User> users = getAllUsers();
		for (User it : users) {
			if (it.getEmail().equals(email)) {
				it.setPassword(password);
			}
		}
	}


}
