package implementation;

import java.util.Collection;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import departement.Departement;
import departement.Enseignement;
import enseignant.Enseignant;
import interfaces.IDep_GUI;
import intervention.Intervention;
import souhait.Souhait;

public class Dep_GUI implements IDep_GUI {
	private Dep_Metier dep;
	private Departement d;
	
	public Dep_GUI(Dep_Metier dep, Departement d) {
		this.dep = dep;
		this.d = d;
	}
	
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
	//------------------------------------------------------------

	@Override
	public void validerVoeux(Collection<Souhait> voeux) {
		// TODO Auto-generated method stub
		dep.validerVoeux(voeux, d);
	}

	//------------------------------------------------------------
	@Override
	public void affecter(Souhait s) {
		// TODO Auto-generated method stub

	}
	//------------------------------------------------------------

	@Override
	public void validerInterventionsExterieures(Collection<Souhait> interventionsExterieures) {
		// TODO Auto-generated method stub
		dep.validerInterventionsExterieures(interventionsExterieures, d);
	}

	@Override
	public void validerDemandesSpeciales(Collection<Souhait> demandesSpeciales) {
		// TODO Auto-generated method stub
		dep.validerDemandesSpeciales(demandesSpeciales, d);
	}

	//------------------------------------------------------------
	@Override
	public Collection<Souhait> getSouhaitNonValides() {
		// TODO Auto-generated method stub
		return dep.getSouhaitNonValides(d);
	}

	@Override
	public void validerSouhaits(Collection<Souhait> souhaits) {
		// TODO Auto-generated method stub
		dep.validerSouhaits(souhaits, d);
	}

	@Override
	public Collection<Souhait> getSouhaits(int year, String critere) {
		// TODO Auto-generated method stub
		return dep.getSouhaits(year, critere, d);
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
