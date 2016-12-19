package implementation;

import java.util.Collection;

import departement.Enseignement;
import enseignant.Enseignant;
import interfaces.IDep_Persistance;
import intervention.Intervention;
import souhait.Souhait;

public class Dep_Persistance implements IDep_Persistance {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
	/*en attendant la gestion de BDD*/
	private Collection<Souhait> souhaitsV;
	private Collection<Souhait> souhaitsNV;
	/*------------------------------*/

	public Dep_Persistance() {
	}
<<<<<<< HEAD
=======
=======
>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26

	@Override
	public Collection<Souhait> getSouhaits() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
		Collection<Souhait> souhaits = souhaitsV;
		for (Souhait each : souhaitsNV) {
			souhaits.add(each);
		}
		return souhaits;
<<<<<<< HEAD
=======
=======
		return null;
>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
	}

	@Override
	public void validerVoeux(Collection<Souhait> voeux) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		for (Souhait each : voeux) {
			souhaitsV.add(each);
		}
		souhaitsNV.removeAll(voeux);
=======
<<<<<<< HEAD
		for (Souhait each : voeux) {
			souhaitsV.add(each);
		}
=======

>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
	}

	@Override
	public void affecter(Souhait s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void affecter(Enseignant e, Enseignement ens) {
		// TODO Auto-generated method stub

	}

	@Override
	public void validerInterventionsExterieures(Collection<Souhait> interventionsExterieures) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		for (Souhait each : interventionsExterieures) {
			souhaitsV.add(each);
		}
		souhaitsNV.removeAll(interventionsExterieures);
=======
<<<<<<< HEAD
		for (Souhait each : interventionsExterieures) {
			souhaitsV.add(each);
		}
=======
>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26

	}

	@Override
	public void validerDemandesSpeciales(Collection<Souhait> demandesSpeciales) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		for (Souhait each : demandesSpeciales) {
			souhaitsV.add(each);
		}
		souhaitsNV.removeAll(demandesSpeciales);
=======
<<<<<<< HEAD
		for (Souhait each : demandesSpeciales) {
			souhaitsV.add(each);
		}
=======
>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26

	}

	@Override
	public Collection<Souhait> getSouhaitNonValides() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return souhaitsNV;
=======
<<<<<<< HEAD
		return souhaitsNV;
=======
		return null;
>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
	}

	@Override
	public void validerSouhaits(Collection<Souhait> souhaits) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		for (Souhait each : souhaits) {
			souhaitsV.add(each);
		}
		souhaitsNV.removeAll(souhaits);
=======
<<<<<<< HEAD
		for (Souhait each : souhaits) {
			souhaitsV.add(each);
		}
=======

>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
	}

	@Override
	public Collection<Souhait> getSouhaits(int year, String critere) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
<<<<<<< HEAD
	public Collection<Intervention> getAffectations(int year, Intervention i) {
=======
	public Collection<Intervention> getAffectations(int year, String critere) {
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAffectations(Enseignant e, Enseignement ens, Intervention i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Enseignement> getEnseignementsDispo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Enseignement> getEnseignementsDispo(Collection<String> critere) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Souhait> publierSouhait() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		Collection<Souhait> souhaits = souhaitsV;
		souhaits.addAll(souhaitsNV);
		return souhaits;
=======
		return null;
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
	}

	@Override
	public Collection<Intervention> getInterventions(int year, Enseignant e) {
		// TODO Auto-generated method stub
		return null;
	}

}
