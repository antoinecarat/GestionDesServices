package enseignant;

import misc.CasualValue;


class Service {

	private CasualValue<Integer> annee;
	private CasualValue<Integer> volume;
	
	public int getAnnee() {
		return (this.annee.getValue());
	}
	
	public void setAnnee(int a) {
		this.annee.setValue(a);
	}
	
	public int getVolume() {
		return (this.volume.getValue());
	}
	
	public void setVolume(int v) {
		this.volume.setValue(v);
	}
	
	
	
}
