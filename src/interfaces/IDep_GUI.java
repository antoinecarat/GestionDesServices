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
	Collection<Intervention> getAffectations(int year, Intervention i);
<<<<<<< HEAD
	void setAffectations(Enseignant e, Enseignement ens, Intervention i);
=======
	void setAffectations(Enseignant e, Enseignement ens);
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
	Collection<Souhait> publierConflits();
}
