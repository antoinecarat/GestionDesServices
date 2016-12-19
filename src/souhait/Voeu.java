package souhait;

import misc.CasualValue;

public class Voeu extends Souhait {
	
	private CasualValue<Integer> preference;

	public Voeu() {
		this.preference = new CasualValue<Integer>();
	}
	public Voeu(CasualValue<Integer> p) {
		this.preference = p;
	}
	
	
	public int getPreference() {
		return (this.preference.getValue());
	}		

	public void setPreference(int p) {
		this.preference.setValue(p);
	}
	
	
}
