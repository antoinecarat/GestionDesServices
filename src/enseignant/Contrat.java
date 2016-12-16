package enseignant;

import misc.CasualValue;

class Contrat {

	private Hour min;
	private CasualValue<Hour> max;
	
	public Hour getMin() {
		return min;
	}
	
	public void setMin(Hour min) {
		this.min = min;
	}
	
	public Hour getMax() {
		return (this.max.getValue());
	}
	
	public void setMax(Hour m) {
		this.max.setValue(m);
	}
	
	
	
	
	
	
}
