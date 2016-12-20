package implementation;

import java.util.Collection;

import departement.Enseignement;
<<<<<<< HEAD
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
=======
import interfaces.IEns_Persistance;
import intervention.Intervention;
import souhait.Souhait;

public class Ens_Persistance implements IEns_Persistance {

<<<<<<< HEAD
	public Ens_Persistance() {
	}

=======
<<<<<<< HEAD
	public Ens_Persistance() {
	}

=======
>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
	@Override
	public void emettreVoeu(Souhait voeu) {
		// TODO Auto-generated method stub

>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	}

	@Override
	public void emettreInterventionExterieure(Souhait demandeExterieur) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		souhaitsBL.insertSouhait(demandeExterieur);
=======

>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	}

	@Override
	public void emettreDemandeSpeciale(Souhait demandeSpecial) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		souhaitsBL.insertSouhait(demandeSpecial);
	}

	@Override
	public Collection<Souhait> getSouhaitEmis(Enseignant e) {
		// TODO Auto-generated method stub
		return souhaitsBL.getSouhait();
=======

	}

	@Override
	public Collection<Souhait> getSouhaitEmis() {
		// TODO Auto-generated method stub
		return null;
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
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
