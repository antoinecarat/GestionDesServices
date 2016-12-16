package interfaces;

import intervention.Intervention;

import java.util.Collection;

import souhait.Souhait;
import departement.Enseignement;
import enseignant.Enseignant;

public interface IDep_Metier {

	Collection<Souhait> getSouhaits();
	void validerVoeux(Collection<Souhait> voeux);
	void affecter(Souhait s);
	void affecter(Enseignant e, Enseignement ens);
	void validerInterventionsExterieures(Collection<Souhait> interventionsExterieures);
	void validerDemandesSpeciales(Collection<Souhait> demandesSpeciales);
	Collection<Souhait> getSouhaitNonValides();
	void validerSouhaits(Collection<Souhait> souhaits);
	Collection<Souhait> getSouhaits(int year, String critere);
	Collection<Intervention> getAffectations(int year, String critere);
	void setAffectations(Enseignant e, Enseignement ens);
	Collection<Enseignement> getEnseignementsDispos();
	Collection<Souhait> publierConflits();
	
	
}
