package departement;
import java.util.Collection;

import main.Enseignant;


public class Departement {

	private String nom;
	private Collection<Enseignant> enseignants;
	private Collection<Parcours> parcours;
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Collection<Enseignant> getEnseignants() {
		return enseignants;
	}
	
	public void setEnseignants(Collection<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}
	
	public Collection<Parcours> getParcours() {
		return parcours;
	}
	
	public void setParcours(Collection<Parcours> parcours) {
		this.parcours = parcours;
	}
	
}
