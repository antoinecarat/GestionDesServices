package implementation;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collection;

import departement.Departement;
=======
import java.util.Collection;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import departement.Departement;
<<<<<<< HEAD
=======
=======

>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
import departement.Enseignement;
import enseignant.Enseignant;
import interfaces.IDep_GUI;
import intervention.Intervention;
import souhait.Souhait;

public class Dep_GUI implements IDep_GUI {
	private Dep_Metier dep;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	private Departement d;
	
	public Dep_GUI(Dep_Metier dep, Departement d) {
		this.dep = dep;
		this.d = d;
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	
	@Override
	public Collection<Souhait> getSouhaits() {
		// TODO Auto-generated method stub
		return dep.getSouhaits();
	}

	//------------------------------------------------------------
	@Override
	public Collection<Souhait> filter(Collection<String> criteres) {
		// TODO Auto-generated method stub
		return null;
	}
<<<<<<< HEAD
	//------------------------------------------------------------
=======
<<<<<<< HEAD
	//------------------------------------------------------------
=======
<<<<<<< HEAD
	//------------------------------------------------------------
=======
>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22

	@Override
	public void validerVoeux(Collection<Souhait> voeux) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
		dep.validerVoeux(voeux, d);
	}

	@Override
	public void affecter(Souhait s) {
		// TODO Auto-generated method stub
		dep.affecter(s, d);
	}
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
		dep.validerVoeux(voeux, d);
	}

	//------------------------------------------------------------
=======
		
	}

>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
	@Override
	public void affecter(Souhait s) {
		// TODO Auto-generated method stub

	}
<<<<<<< HEAD
	//------------------------------------------------------------
=======
>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22

	@Override
	public void validerInterventionsExterieures(Collection<Souhait> interventionsExterieures) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		dep.validerInterventionsExterieures(interventionsExterieures, d);
=======
<<<<<<< HEAD
		dep.validerInterventionsExterieures(interventionsExterieures, d);
=======
<<<<<<< HEAD
		dep.validerInterventionsExterieures(interventionsExterieures, d);
=======
		
>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	}

	@Override
	public void validerDemandesSpeciales(Collection<Souhait> demandesSpeciales) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		dep.validerDemandesSpeciales(demandesSpeciales, d);
	}

=======
<<<<<<< HEAD
		dep.validerDemandesSpeciales(demandesSpeciales, d);
	}

=======
<<<<<<< HEAD
		dep.validerDemandesSpeciales(demandesSpeciales, d);
	}

	//------------------------------------------------------------
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	@Override
	public Collection<Souhait> getSouhaitNonValides() {
		// TODO Auto-generated method stub
		return dep.getSouhaitNonValides(d);
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======

	}

	@Override
	public Collection<Souhait> getSouhaitNonValides() {
		// TODO Auto-generated method stub
		return null;
>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	}

	@Override
	public void validerSouhaits(Collection<Souhait> souhaits) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		dep.validerSouhaits(souhaits, d);
=======
<<<<<<< HEAD
		dep.validerSouhaits(souhaits, d);
=======
<<<<<<< HEAD
		dep.validerSouhaits(souhaits, d);
=======

>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	}

	@Override
	public Collection<Souhait> getSouhaits(int year, String critere) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
		return dep.getSouhaits(year, critere, d);
	}

	@Override
	public void setAffectations(Enseignant e, Enseignement ens, Intervention i) {
		// TODO Auto-generated method stub
		dep.setAffectations(e, ens, i, d);
	}

<<<<<<< HEAD
	@Override
	public Collection<Souhait> publierConflits() {
		// TODO Auto-generated method stub
		Collection<Souhait> souhaits = dep.getSouhaits();
		Collection<Souhait> souhaitsNV = dep.getSouhaitNonValides(d);
		souhaits.removeAll(souhaitsNV);
		Collection<Souhait> conflits = new ArrayList<Souhait>();
		for (Souhait each : souhaits) {
			for (Souhait each2 : souhaits){
				if (each != each2) {
					if (each.getHeures() == each2.getHeures()) {
						if (!conflits.contains(each)){
							conflits.add(each);
						}
						conflits.add(each2);
						souhaits.remove(each2);
					}
				}
			}
			souhaits.remove(each);
		}
		return conflits;
	}
	
	@Override
	public Collection<Intervention> getAffectations(int year, Intervention i) {
		// TODO Auto-generated method stub
		return dep.getAffectations(year, i, d);
	}
=======
	//------------------------------------------------------------
=======
<<<<<<< HEAD
		return dep.getSouhaits(year, critere, d);
=======
		return null;
>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
	}

	@Override
	public void setAffectations(Enseignant e, Enseignement ens) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		
=======

>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
	}

>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
	@Override
	public Collection<Souhait> publierConflits() {
		// TODO Auto-generated method stub
		return null;
	}
<<<<<<< HEAD
	//------------------------------------------------------------
=======
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26

	@Override
	public Collection<Intervention> getAffectations(int year, Intervention i) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return dep.getAffectations(year, i, d);
	}
=======
		return null;
	}
	//------------------------------------------------------------
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22

}
