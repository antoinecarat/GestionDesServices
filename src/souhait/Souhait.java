package souhait;

import misc.CasualValue;

import java.io.Serializable;

import enseignant.Hour;


public abstract class Souhait implements Serializable{
	private static final long serialVersionUID = 7512368954215789612L;

	private CasualValue<Boolean> publie;
	private CasualValue<Hour> heures;
	
	public Souhait() {
		this.publie = new CasualValue<Boolean>();
		this.heures = new CasualValue<Hour>();
	}
	public Souhait(CasualValue<Boolean> p, CasualValue<Hour> h) {
		this.publie = p;
		this.heures = h;
	}
	
	public boolean isPublie() {

		return (this.publie.getValue());
	}
	
	public void setPublie(boolean p) {

		this.publie.setValue(p);
	}
	
	public Hour getHeures() {

		return (this.heures.getValue());
	}
	
	public void setHeures(Hour h) {
		this.heures.setValue(h);
	}
	
	
}
