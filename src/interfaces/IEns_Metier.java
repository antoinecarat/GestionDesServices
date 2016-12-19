package interfaces;

import java.util.Collection;

import departement.Enseignement;
import enseignant.Enseignant;
import intervention.Intervention;
import souhait.Souhait;

public interface IEns_Metier {

	Collection<Intervention> getInterventions(int year, Enseignant e);
	Collection<Enseignement> getEnseignementsDispo(Enseignant e);
	void emettreVoeu(Souhait voeu);
	void emettreInterventionExterieure(Souhait demandeExterieur);
	void emettreDemandeSpeciale(Souhait demandeSpecial);
	Collection<Souhait> getSouhaitEmis();
	void publierSouhaits(Collection<Souhait> souhaits);
	Collection<Enseignement> getEnseignementsDispo(Collection<String> criteres);
	void sauvegarderInterventionsPrecedentes(Collection<Intervention> i);
	void sauvegarderEnseignementsDispo(Collection<Enseignement> enseignements);
}
