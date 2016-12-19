package interfaces;

import java.util.Collection;

import departement.Departement;
import departement.Enseignement;
import enseignant.Enseignant;
import intervention.Intervention;
import souhait.Souhait;

public interface IDep_Metier {

	Collection<Souhait> getSouhaits();
	void validerVoeux(Collection<Souhait> voeux, Departement d);
	void affecter(Souhait s, Departement d);
	void affecter(Enseignant e, Enseignement ens, Departement d);
	void validerInterventionsExterieures(Collection<Souhait> interventionsExterieures, Departement d);
	void validerDemandesSpeciales(Collection<Souhait> demandesSpeciales, Departement d);
	Collection<Souhait> getSouhaitNonValides(Departement d);
	void validerSouhaits(Collection<Souhait> souhaits, Departement d);
	Collection<Souhait> getSouhaits(int year, String critere, Departement d);
<<<<<<< HEAD
	Collection<Intervention> getAffectations(int year, Intervention i, Departement d);
=======
	Collection<Intervention> getAffectations(int year, String critere, Departement d);
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
	void setAffectations(Enseignant e, Enseignement ens, Intervention a, Departement d);
	Collection<Intervention> getInterventions(int year, Enseignant e, Departement d);
	Collection<Enseignement> getEnseignementsDispos(Departement d);
	Collection<Enseignement> getEnseignementsDispos(Collection<String> critere, Departement d);
	Collection<Souhait> publierSouhaits();
	
	
}
