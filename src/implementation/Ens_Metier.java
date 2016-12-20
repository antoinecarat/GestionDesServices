package implementation;

import java.util.Collection;

import departement.Enseignement;
import enseignant.Enseignant;
import interfaces.IEns_Metier;
import intervention.Intervention;
import souhait.Souhait;

public class Ens_Metier implements IEns_Metier {
<<<<<<< HEAD
	private Dep_Metier dep;
	private Ens_Persistance ens;

=======
<<<<<<< HEAD
	private Dep_Metier dep;
	private Ens_Persistance ens;

=======
	//private Dep_Metier dep;
	private Ens_Persistance ens;

<<<<<<< HEAD
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	public Ens_Metier(Ens_Persistance ens) {
		this.ens = ens;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	@Override
	public Collection<Intervention> getInterventions(int year, Enseignant e) {
		// TODO Auto-generated method stub
		return dep.getInterventions(year, e, dep.getDepartement());
	}

	//------------------------------------------------------------
	@Override
<<<<<<< HEAD
	public Collection<Enseignement> getEnseignementsDispo(Collection<String> criteres) {
		// TODO Auto-generated method stub
		return null;
	}
=======
	public Collection<Enseignement> getEnseignementsDispo(Enseignant e) {
		// TODO Auto-generated method stub
=======
=======
>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
	//------------------------------------------------------------
	@Override
	public Collection<Intervention> getInterventions(int year, Enseignant e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Enseignement> getEnseignementsDispo(Enseignant e) {
		// TODO Auto-generated method stub
		
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
		return null;
	}
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
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
<<<<<<< HEAD
	public Collection<Souhait> getSouhaitEmis(Enseignant e) {
		// TODO Auto-generated method stub
		return ens.getSouhaitEmis(e);
=======
	public Collection<Souhait> getSouhaitEmis() {
		// TODO Auto-generated method stub
		return ens.getSouhaitEmis();
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	}

	//------------------------------------------------------------
	@Override
	public void publierSouhaits(Collection<Souhait> souhaits) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		dep.publierSouhaits(souhaits,dep.getDepartement());
	}

	@Override
	public Collection<Enseignement> getEnseignementsDispo() {
=======
		
	}

	@Override
	public Collection<Enseignement> getEnseignementsDispo(Collection<String> criteres) {
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
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
