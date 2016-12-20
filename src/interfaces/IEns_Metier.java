package interfaces;

import java.util.Collection;

import departement.Enseignement;
import enseignant.Enseignant;
import intervention.Intervention;
import souhait.Souhait;

public interface IEns_Metier {

	Collection<Intervention> getInterventions(int year, Enseignant e);
<<<<<<< HEAD
	Collection<Enseignement> getEnseignementsDispo(Collection<String> criteres);
=======
	Collection<Enseignement> getEnseignementsDispo(Enseignant e);
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	void emettreVoeu(Souhait voeu);
	void emettreInterventionExterieure(Souhait demandeExterieur);
	void emettreDemandeSpeciale(Souhait demandeSpecial);
	Collection<Souhait> getSouhaitEmis(Enseignant e);
	void publierSouhaits(Collection<Souhait> souhaits);
<<<<<<< HEAD
	Collection<Enseignement> getEnseignementsDispo();
=======
	Collection<Enseignement> getEnseignementsDispo(Collection<String> criteres);
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	void sauvegarderInterventionsPrecedentes(Collection<Intervention> i);
	void sauvegarderEnseignementsDispo(Collection<Enseignement> enseignements);
}
