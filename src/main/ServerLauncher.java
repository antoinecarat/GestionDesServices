package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerLauncher {

	public static void main(String[] args) {
		
		//Start Spring Context
		new ClassPathXmlApplicationContext("applicationContext.xml",
				ServerLauncher.class);
		
	}

}