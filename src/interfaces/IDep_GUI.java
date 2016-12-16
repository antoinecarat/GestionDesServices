package interfaces;

import intervention.Intervention;

import java.util.Collection;

import souhait.Souhait;
import departement.Enseignement;
import enseignant.Enseignant;

public interface IDep_GUI {

	Collection<Souhait> getSouhaits();
	Collection<Souhait> filter(Collection<String> criteres);
	void validerVoeux(Collection<Souhait> voeux);
	void affecter(Souhait s);
	void validerInterventionsExterieures(Collection<Souhait> interventionsExterieures);
	void validerDemandesSpeciales(Collection<Souhait> demandesSpeciales);
	Collection<Souhait> getSouhaitNonValides();
	void validerSouhaits(Collection<Souhait> souhaits);
	Collection<Souhait> getSouhaits(int year, String critere);
	Collection<Intervention> getAffectations();
	void setAffectations(Enseignant e, Enseignement ens);
	Collection<Souhait> publierConflits();
}
