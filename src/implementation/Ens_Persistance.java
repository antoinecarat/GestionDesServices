package implementation;

import java.util.Collection;

import departement.Enseignement;
import interfaces.IEns_Persistance;
import intervention.Intervention;
import souhait.Souhait;

public class Ens_Persistance implements IEns_Persistance {

	@Override
	public void emettreVoeu(Souhait voeu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void emettreInterventionExterieure(Souhait demandeExterieur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void emettreDemandeSpeciale(Souhait demandeSpecial) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Souhait> getSouhaitEmis() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sauvegarderInterventionsPrecedentes(Collection<Intervention> i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sauvegarderEnseignementsDispos(Collection<Enseignement> enseignements) {
		// TODO Auto-generated method stub

	}

}
