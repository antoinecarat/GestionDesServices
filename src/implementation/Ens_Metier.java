package implementation;

import java.util.Collection;

import departement.Enseignement;
import enseignant.Enseignant;
import interfaces.IEns_Metier;
import intervention.Intervention;
import souhait.Souhait;

public class Ens_Metier implements IEns_Metier {
	private Dep_Metier dep;
	private Ens_Persistance ens;

	public Ens_Metier(Ens_Persistance ens) {
		this.ens = ens;
	}

	@Override
	public Collection<Intervention> getInterventions(int year, Enseignant e) {
		// TODO Auto-generated method stub
		return dep.getInterventions(year, e, dep.getDepartement());
	}

	//------------------------------------------------------------
	@Override
	public Collection<Enseignement> getEnseignementsDispo(Collection<String> criteres) {
		// TODO Auto-generated method stub
		return null;
	}
	//------------------------------------------------------------
	
	@Override
	public void emettreVoeu(Souhait voeu) {
		// TODO Auto-generated method stub
		ens.emettreVoeu(voeu);
	}

	@Override
	public void emettreInterventionExterieure(Souhait demandeExterieur) {
		// TODO Auto-generated method stub
		ens.emettreInterventionExterieure(demandeExterieur);
	}

	@Override
	public void emettreDemandeSpeciale(Souhait demandeSpecial) {
		// TODO Auto-generated method stub
		ens.emettreDemandeSpeciale(demandeSpecial);
	}

	@Override
	public Collection<Souhait> getSouhaitEmis(Enseignant e) {
		// TODO Auto-generated method stub
		return ens.getSouhaitEmis(e);
	}

	//------------------------------------------------------------
	@Override
	public void publierSouhaits(Collection<Souhait> souhaits) {
		// TODO Auto-generated method stub
		dep.publierSouhaits(souhaits,dep.getDepartement());
	}

	@Override
	public Collection<Enseignement> getEnseignementsDispo() {
		// TODO Auto-generated method stub
		return null;
	}
	//------------------------------------------------------------

	@Override
	public void sauvegarderInterventionsPrecedentes(Collection<Intervention> i) {
		// TODO Auto-generated method stub
		ens.sauvegarderInterventionsPrecedentes(i);
	}

	@Override
	public void sauvegarderEnseignementsDispo(Collection<Enseignement> enseignements) {
		// TODO Auto-generated method stub
		ens.sauvegarderEnseignementsDispos(enseignements);
	}

}