package souhait;

import misc.CasualValue;
import enseignant.Hour;


abstract class Souhait {

	private CasualValue<Boolean> publie;
	private CasualValue<Hour> heures;
	
	
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
