package net.cine.app.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.ContextLoader;

public class Listener extends ContextLoader implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("eso es un eventos d");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("eso es un eventos disparado");
	}
	
}
