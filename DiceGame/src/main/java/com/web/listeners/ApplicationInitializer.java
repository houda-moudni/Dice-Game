package com.web.listeners;

import com.bo.User;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@WebListener
public class ApplicationInitializer implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public ApplicationInitializer() {

	}

	public void contextInitialized(ServletContextEvent sce) {
		ServletContext ctx = sce.getServletContext();

		System.out.println("Opération effectuée");
//		synchronizedList : Because it can't be used in multi-thread application
		List<User> userList = Collections.synchronizedList(new ArrayList<User>());

		ctx.setAttribute("users", userList);

	}

}
