package departement;

import enseignant.Hour;


public class Enseignement {

	private Hour volume;
	private TypeEnseignement type;
	
	public Enseignement(Hour volume, TypeEnseignement type) {
		this.volume = volume;
		this.type = type;
	}

	public Hour getVolume() {
		return volume;
	}
	
	public void setVolume(Hour volume) {
		this.volume = volume;
	}
	
	public TypeEnseignement getType() {
		return type;
	}
	
	public void setType(TypeEnseignement type) {
		this.type = type;
	}
	
	
	
}
