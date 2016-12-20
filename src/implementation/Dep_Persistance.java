package implementation;

import java.util.Collection;

import departement.Enseignement;
import enseignant.Enseignant;
import interfaces.IDep_Persistance;
import intervention.Intervention;
import souhait.Souhait;

public class Dep_Persistance implements IDep_Persistance {
	/*en attendant la gestion de BDD*/
	private Collection<Souhait> souhaitsV;
	private Collection<Souhait> souhaitsNV;
	/*------------------------------*/

	public Dep_Persistance() {
	}

	@Override
	public Collection<Souhait> getSouhaits() {
		// TODO Auto-generated method stub
		Collection<Souhait> souhaits = souhaitsV;
		for (Souhait each : souhaitsNV) {
			souhaits.add(each);
		}
		return souhaits;
	}

	@Override
	public void validerVoeux(Collection<Souhait> voeux) {
		// TODO Auto-generated method stub
		for (Souhait each : voeux) {
			souhaitsV.add(each);
		}
		souhaitsNV.removeAll(voeux);
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
		for (Souhait each : interventionsExterieures) {
			souhaitsV.add(each);
		}
		souhaitsNV.removeAll(interventionsExterieures);

	}

	@Override
	public void validerDemandesSpeciales(Collection<Souhait> demandesSpeciales) {
		// TODO Auto-generated method stub
		for (Souhait each : demandesSpeciales) {
			souhaitsV.add(each);
		}
		souhaitsNV.removeAll(demandesSpeciales);

	}

	@Override
	public Collection<Souhait> getSouhaitNonValides() {
		// TODO Auto-generated method stub
		return souhaitsNV;
	}

	@Override
	public void validerSouhaits(Collection<Souhait> souhaits) {
		// TODO Auto-generated method stub
		for (Souhait each : souhaits) {
			souhaitsV.add(each);
		}
		souhaitsNV.removeAll(souhaits);
	}

	@Override
	public Collection<Souhait> getSouhaits(int year, String critere) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Intervention> getAffectations(int year, Intervention i) {
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
	public void publierSouhait(Collection<Souhait> souhaits) {
		// TODO Auto-generated method stub
		for (Souhait each : souhaits) {
			souhaitsNV.add(each);
		}
	}

	@Override
	public Collection<Intervention> getInterventions(int year, Enseignant e) {
		// TODO Auto-generated method stub
		return null;
	}

}
