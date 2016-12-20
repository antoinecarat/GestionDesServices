package implementation;

import java.util.Collection;

import departement.Enseignement;
import enseignant.Enseignant;
import interfaces.IEns_Persistance;
import intervention.Intervention;
import main.SouhaitService;
import souhait.Souhait;

public class Ens_Persistance implements IEns_Persistance {
	private SouhaitService souhaitsBL;

	public Ens_Persistance(SouhaitService s) {
		this.souhaitsBL = s;
	}

	@Override
	public void emettreVoeu(Souhait voeu) {
		// TODO Auto-generated method stub
		souhaitsBL.insertSouhait(voeu);
	}

	@Override
	public void emettreInterventionExterieure(Souhait demandeExterieur) {
		// TODO Auto-generated method stub
		souhaitsBL.insertSouhait(demandeExterieur);
	}

	@Override
	public void emettreDemandeSpeciale(Souhait demandeSpecial) {
		// TODO Auto-generated method stub
		souhaitsBL.insertSouhait(demandeSpecial);
	}

	@Override
	public Collection<Souhait> getSouhaitEmis(Enseignant e) {
		// TODO Auto-generated method stub
		return souhaitsBL.getSouhait();
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
