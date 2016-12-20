package implementation;

import java.util.Collection;

import departement.Departement;
import departement.Enseignement;
import enseignant.Enseignant;
import interfaces.IDep_Metier;
import intervention.Intervention;
import souhait.Souhait;

public class Dep_Metier implements IDep_Metier {
	private Dep_Persistance dep;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	private Departement d;

	public Dep_Metier(Dep_Persistance dep, Departement d) {
		this.dep = dep;
		this.d = d;
	}

<<<<<<< HEAD
	@Override
	public Collection<Souhait> getSouhaits(Departement d) {
=======
=======

<<<<<<< HEAD
	public Dep_Metier(Dep_Persistance dep) {
		this.dep = dep;
	}

=======
>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
	@Override
	public Collection<Souhait> getSouhaits() {
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
		// TODO Auto-generated method stub
		return dep.getSouhaits();
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
	//------------------------------------------------------------
	//What's the use of Departement as an entry of methods/functions ??? 
=======
	//What's the use of Departement as a entry of methods ??? 
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
	//------------------------------------------------------------
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	@Override
	public void validerVoeux(Collection<Souhait> voeux, Departement d) {
		// TODO Auto-generated method stub
		dep.validerVoeux(voeux);
	}

	@Override
	public void affecter(Souhait s, Departement d) {
		// TODO Auto-generated method stub
		dep.affecter(s);
	}

	@Override
	public void affecter(Enseignant e, Enseignement ens, Departement d) {
		// TODO Auto-generated method stub
		dep.affecter(e, ens);
	}

	@Override
	public void validerInterventionsExterieures(Collection<Souhait> interventionsExterieures, Departement d) {
		// TODO Auto-generated method stub
		dep.validerInterventionsExterieures(interventionsExterieures);
	}

	@Override
	public void validerDemandesSpeciales(Collection<Souhait> demandesSpeciales, Departement d) {
		// TODO Auto-generated method stub
		dep.validerDemandesSpeciales(demandesSpeciales);
	}

	@Override
	public Collection<Souhait> getSouhaitNonValides(Departement d) {
		// TODO Auto-generated method stub
		return dep.getSouhaitNonValides();
	}

	@Override
	public void validerSouhaits(Collection<Souhait> souhaits, Departement d) {
		// TODO Auto-generated method stub
		dep.validerSouhaits(souhaits);
	}

	@Override
	public Collection<Souhait> getSouhaits(int year, String critere, Departement d) {
		// TODO Auto-generated method stub
		return dep.getSouhaits(year, critere);
	}

	@Override
<<<<<<< HEAD
	public Collection<Intervention> getAffectations(int year, Intervention i, Departement d) {
		// TODO Auto-generated method stub
		return dep.getAffectations(year, i);
=======
<<<<<<< HEAD
	public Collection<Intervention> getAffectations(int year, Intervention i, Departement d) {
		// TODO Auto-generated method stub
		return dep.getAffectations(year, i);
=======
	public Collection<Intervention> getAffectations(int year, String critere, Departement d) {
		// TODO Auto-generated method stub
		return dep.getAffectations(year, critere);
>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
	}

	@Override
	public void setAffectations(Enseignant e, Enseignement ens, Intervention a, Departement d) {
		// TODO Auto-generated method stub
		dep.setAffectations(e, ens, a);
	}

	@Override
	public Collection<Intervention> getInterventions(int year, Enseignant e, Departement d) {
		// TODO Auto-generated method stub
		return dep.getInterventions(year, e);
	}

	@Override
	public Collection<Enseignement> getEnseignementsDispos(Departement d) {
		// TODO Auto-generated method stub
		return dep.getEnseignementsDispo();
	}

	@Override
	public Collection<Enseignement> getEnseignementsDispos(Collection<String> critere, Departement d) {
		// TODO Auto-generated method stub
		return dep.getEnseignementsDispo(critere);
	}

	@Override
<<<<<<< HEAD
	public void publierSouhaits(Collection<Souhait> souhaits, Departement d) {
		// TODO Auto-generated method stub
		dep.publierSouhait(souhaits);
	}
	
	//------------------------------------------------------------
	public Departement getDepartement(){
		return this.d;
	}
=======
	public Collection<Souhait> publierSouhaits() {
		// TODO Auto-generated method stub
		return dep.publierSouhait();
	}
<<<<<<< HEAD
	//------------------------------------------------------------

	public Departement getDepartement(){
		return this.d;
	}
=======
<<<<<<< HEAD
	//------------------------------------------------------------
=======
>>>>>>> fad776f4787d15aba8aec3c730713c0068da7a92

>>>>>>> 3d471ae124b6d4267434b2e2ca89f2237e23ae26
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
}
