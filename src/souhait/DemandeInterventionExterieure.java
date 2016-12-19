package souhait;

import misc.CasualValue;


public class DemandeInterventionExterieure extends Souhait {
	
	private CasualValue<String> organisation;

	public String getOrganisation() {
		return (this.organisation.getValue());
	}

	public void setOrganisation(String o) {
		this.organisation.setValue(o);
	}
	
}
