package implementation;

import java.util.Collection;

import departement.Enseignement;
import enseignant.Enseignant;
import interfaces.IDep_GUI;
import intervention.Intervention;
import souhait.Souhait;

public class Dep_GUI implements IDep_GUI {
	private Dep_Metier dep;
	
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

	@Override
	public void validerVoeux(Collection<Souhait> voeux) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void affecter(Souhait s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void validerInterventionsExterieures(Collection<Souhait> interventionsExterieures) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validerDemandesSpeciales(Collection<Souhait> demandesSpeciales) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Souhait> getSouhaitNonValides() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validerSouhaits(Collection<Souhait> souhaits) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Souhait> getSouhaits(int year, String critere) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAffectations(Enseignant e, Enseignement ens) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Souhait> publierConflits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Intervention> getAffectations(int year, Intervention i) {
		// TODO Auto-generated method stub
		return null;
	}
	//------------------------------------------------------------

}
