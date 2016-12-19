package interfaces;

import intervention.Intervention;

import java.util.Collection;

import souhait.Souhait;
import departement.Enseignement;
import enseignant.Enseignant;

public interface IDep_Persistance {

	Collection<Souhait> getSouhaits();
	void validerVoeux(Collection<Souhait> voeux);
	void affecter(Souhait s);
	void affecter(Enseignant e, Enseignement ens);
	void validerInterventionsExterieures(Collection<Souhait> interventionsExterieures);
	void validerDemandesSpeciales(Collection<Souhait> demandesSpeciales);
	Collection<Souhait> getSouhaitNonValides();
	void validerSouhaits(Collection<Souhait> souhaits);
	Collection<Souhait> getSouhaits(int year, String critere);
<<<<<<< HEAD
	Collection<Intervention> getAffectations(int year, Intervention i);
=======
	Collection<Intervention> getAffectations(int year, String critere);
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
	void setAffectations(Enseignant e, Enseignement ens, Intervention i);
	Collection<Enseignement> getEnseignementsDispo();
	Collection<Enseignement> getEnseignementsDispo(Collection<String> critere);
	Collection<Souhait> publierSouhait();
	Collection<Intervention> getInterventions(int year, Enseignant e);
}
