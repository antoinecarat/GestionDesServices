package implementation;

import java.util.Collection;

import departement.Enseignement;
<<<<<<< HEAD
import enseignant.Enseignant;
=======
<<<<<<< HEAD
import enseignant.Enseignant;
=======
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
import interfaces.IEns_GUI;
import intervention.Intervention;
import souhait.Souhait;

public class Ens_GUI implements IEns_GUI {
	private Ens_Metier ens;
<<<<<<< HEAD
	private Enseignant e;

=======
<<<<<<< HEAD
	private Enseignant e;

=======

<<<<<<< HEAD
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	public Ens_GUI(Ens_Metier ens) {
		this.ens = ens;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	@Override
	public Collection<Intervention> getInterventions(int year) {
		// TODO Auto-generated method stub
		return ens.getInterventions(year, e);
<<<<<<< HEAD
=======
=======
=======
>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
	//------------------------------------------------------------
	@Override
	public Collection<Intervention> getInterventions(int year) {
		// TODO Auto-generated method stub
		return null;
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	}

	@Override
	public Collection<Enseignement> getEnseignementsDispo() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return ens.getEnseignementsDispo(e);
	}
=======
<<<<<<< HEAD
		return ens.getEnseignementsDispo(e);
	}
=======
		return null;
	}
	//------------------------------------------------------------
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22

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

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	@Override
	public Collection<Enseignement> getEnseignementsDispo(Collection<String> criteres) {
		// TODO Auto-generated method stub
		return ens.getEnseignementsDispo(criteres);
	}
<<<<<<< HEAD
=======
=======
	//------------------------------------------------------------

	@Override
	public Collection<Enseignement> getEnseignementsDispo(Collection<String> criteres) {
		// TODO Auto-generated method stub
		return null;
	}
	//------------------------------------------------------------
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22

}
