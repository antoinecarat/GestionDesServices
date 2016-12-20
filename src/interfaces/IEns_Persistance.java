package interfaces;

import java.util.Collection;

import departement.Enseignement;
import enseignant.Enseignant;
import intervention.Intervention;
import souhait.Souhait;

public interface IEns_Persistance {

	void emettreVoeu(Souhait voeu);
	void emettreInterventionExterieure(Souhait demandeExterieur);
	void emettreDemandeSpeciale(Souhait demandeSpecial);
	Collection<Souhait> getSouhaitEmis(Enseignant e);
	void sauvegarderInterventionsPrecedentes(Collection<Intervention> i);
	void sauvegarderEnseignementsDispos(Collection<Enseignement> enseignements);
	
}
