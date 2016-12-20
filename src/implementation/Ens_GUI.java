package implementation;

import java.util.Collection;

import departement.Enseignement;
import enseignant.Enseignant;
import interfaces.IEns_GUI;
import intervention.Intervention;
import souhait.Souhait;

public class Ens_GUI implements IEns_GUI {
	private Ens_Metier ens;
	private Enseignant e;

	public Ens_GUI(Ens_Metier ens) {
		this.ens = ens;
	}

	@Override
	public Collection<Intervention> getInterventions(int year) {
		// TODO Auto-generated method stub
		return ens.getInterventions(year, e);
	}

	@Override
	public Collection<Enseignement> getEnseignementsDispo() {
		// TODO Auto-generated method stub
		return ens.getEnseignementsDispo(e);
	}

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
	public Collection<Souhait> getSouhaitEmis() {
		// TODO Auto-generated method stub
		return ens.getSouhaitEmis();
	}

	@Override
	public void publierSouhaits(Collection<Souhait> souhaits) {
		// TODO Auto-generated method stub
		ens.publierSouhaits(souhaits);
	}

	@Override
	public Collection<Enseignement> getEnseignementsDispo(Collection<String> criteres) {
		// TODO Auto-generated method stub
		return ens.getEnseignementsDispo(criteres);
	}

}
