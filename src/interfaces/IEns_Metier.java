package interfaces;

import intervention.Intervention;

import java.util.Collection;

import souhait.Souhait;
import departement.Enseignement;

public interface IEns_Metier {

	Collection<Intervention> getInterventions(int year);
	Collection<Enseignement> getEnseignementsDispo();
	void emettreVoeu(Souhait voeu);
	void emettreInterventionExterieure(Souhait demandeExterieur);
	void emettreDemandeSpeciale(Souhait demandeSpecial);
	Collection<Souhait> getSouhaitEmis();
	void publierSouhaits(Collection<Souhait> souhaits);
	Collection<Enseignement> getEnseignementsDispo(Collection<String> criteres);
	void sauvegarderInterventionsPrecedentes();
	void sauvegarderEnseignementsDispos(Collection<Enseignement> enseignements);
}
