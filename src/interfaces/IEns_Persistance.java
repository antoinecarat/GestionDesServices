package interfaces;

import java.util.Collection;

import departement.Enseignement;
<<<<<<< HEAD
import enseignant.Enseignant;
=======
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
import intervention.Intervention;
import souhait.Souhait;

public interface IEns_Persistance {

	void emettreVoeu(Souhait voeu);
	void emettreInterventionExterieure(Souhait demandeExterieur);
	void emettreDemandeSpeciale(Souhait demandeSpecial);
<<<<<<< HEAD
	Collection<Souhait> getSouhaitEmis(Enseignant e);
=======
	Collection<Souhait> getSouhaitEmis();
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	void sauvegarderInterventionsPrecedentes(Collection<Intervention> i);
	void sauvegarderEnseignementsDispos(Collection<Enseignement> enseignements);
	
}
