package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");
		SouhaitService souaitServ = (SouhaitService) context.getBean("wishBean");
		
		
		
		
		
		
		/*
		IDep_GUI d = (IDep_GUI) context.getBean("depBean");
		Departement a = new Departement();
		Voeu v = new Voeu();
		ArrayList<Souhait> voeux = new ArrayList<Souhait>();
		voeux.add(v);
		d.validerVoeux(voeux);
		Souhait ds = new DemandeSpeciale();
		ArrayList<Souhait> demS = new ArrayList<Souhait>();
		voeux.add(ds);
		d.validerVoeux(demS);
		Souhait die = new DemandeInterventionExterieure();
		ArrayList<Souhait> demI = new ArrayList<Souhait>();
		voeux.add(die);
		d.validerVoeux(demI);
		Collection<Souhait> souhaits = d.getSouhaits();
		int i = 0;
		for (Souhait each : souhaits) {
			i++;
			System.out.println("Souhait "+i+" récupéré ; ");
		}*/
		
		}

}
