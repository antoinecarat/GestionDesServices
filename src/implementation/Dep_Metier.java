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

	@Override
	public Collection<Souhait> getSouhaits() {
		// TODO Auto-generated method stub
		return dep.getSouhaits();
	}

	//What's the use of Departement as a entry of methods ??? 
	//------------------------------------------------------------
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
	public Collection<Intervention> getAffectations(int year, String critere, Departement d) {
		// TODO Auto-generated method stub
		return dep.getAffectations(year, critere);
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
	public Collection<Souhait> publierSouhaits() {
		// TODO Auto-generated method stub
		return dep.publierSouhait();
	}

}
