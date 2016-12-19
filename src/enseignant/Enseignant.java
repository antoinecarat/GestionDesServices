package enseignant;

import misc.CasualValue;

public class Enseignant {

	private String nom;
	private String prenom;
	private CasualValue<String> statut;
	
	public Enseignant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getStatut() {
		return (this.statut.getValue());
	}
	
	public void setStatut(String statut) {
		this.statut.setValue(statut);
	}
	
	
}
