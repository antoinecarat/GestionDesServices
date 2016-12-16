package souhait;

import misc.CasualValue;

class Voeu extends Souhait {
	
	private CasualValue<Integer> preference;

	public int getPreference() {
		return (this.preference.getValue());
	}		

	public void setPreference(int p) {
		this.preference.setValue(p);
	}
	
	
}
