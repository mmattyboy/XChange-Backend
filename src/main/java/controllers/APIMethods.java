package controllers;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.UserDAO;
import model.User;

import config.Constants;

public class APIMethods {

	private static ClassPathXmlApplicationContext context = Constants.context;
	
	public APIMethods(){
		context = Constants.context;
		context.registerShutdownHook();
	}
	
	public static User addNewUser(User user){
		return context.getBean(UserDAO.class).addNewUser(user);
	}
	
	public static User updateUser(User user){
		return context.getBean(UserDAO.class).updateUser(user);
	}
	
	public static List<User> getAllUsers(){
		return context.getBean(UserDAO.class).getAllUsers();
	}
	
	public static User getUserByID(int userId){
		return context.getBean(UserDAO.class).getUserByID(userId);
	}
}