package interfaces;

import java.util.Collection;

import souhait.Souhait;
import departement.Enseignement;

public interface IEns_Persistance {

	void emettreVoeu(Souhait voeu);
	void emettreInterventionExterieure(Souhait demandeExterieur);
	void emettreDemandeSpeciale(Souhait demandeSpecial);
	Collection<Souhait> getSouhaitEmis();
	void sauvegarderInterventionsPrecedentes();
	void sauvegarderEnseignementsDispos(Collection<Enseignement> enseignements);
	
}
