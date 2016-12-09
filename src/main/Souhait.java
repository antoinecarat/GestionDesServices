package main;


public abstract class Souhait {

	private boolean publie;
	private Hour heures;
	
	
	public boolean isPublie() {

		return publie;
	}
	
	public void setPublie(boolean publie) {

		this.publie = publie;
	}
	
	public Hour getHeures() {

		return heures;
	}
	
	public void setHeures(Hour heures) {
		this.heures = heures;
	}
	
	
}
