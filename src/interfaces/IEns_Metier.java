package interfaces;

import java.util.Collection;

import departement.Enseignement;
import enseignant.Enseignant;
import intervention.Intervention;
import souhait.Souhait;

public interface IEns_Metier {

	Collection<Intervention> getInterventions(int year, Enseignant e);
	Collection<Enseignement> getEnseignementsDispo(Collection<String> criteres);
	void emettreVoeu(Souhait voeu);
	void emettreInterventionExterieure(Souhait demandeExterieur);
	void emettreDemandeSpeciale(Souhait demandeSpecial);
	Collection<Souhait> getSouhaitEmis(Enseignant e);
	void publierSouhaits(Collection<Souhait> souhaits);
	Collection<Enseignement> getEnseignementsDispo();
	void sauvegarderInterventionsPrecedentes(Collection<Intervention> i);
	void sauvegarderEnseignementsDispo(Collection<Enseignement> enseignements);
}
