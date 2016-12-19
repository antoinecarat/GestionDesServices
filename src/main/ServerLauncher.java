package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class ServerLauncher {

	public static void main(String[] args) {
		
		//Start Spring Context
		ApplicationContext context = new ClassPathXmlApplicationContext("server-beans.xml");
		System.out.println("Serveur ready, waiting for requests");
		
	}

}
