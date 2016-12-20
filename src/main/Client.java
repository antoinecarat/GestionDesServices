package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");
		SouhaitService souhaitServ = (SouhaitService) context.getBean("wishBean");
		
		
		/*faire des commandes qui publient des souhaits (à partir de je sais pas quoi! et c'est bien le (un des) problème)*/
		
		
		
		}

}
