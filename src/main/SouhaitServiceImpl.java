package main;

import java.util.ArrayList;
import java.util.List;

import souhait.Souhait;

public class SouhaitServiceImpl implements SouhaitService {
	
	List<Souhait> souhaits = new ArrayList<Souhait>();

	@Override
	public void insertSouhait(Souhait s) {
		souhaits.add(s);
	}

	@Override
	public List<Souhait> getSouhait() {
		return this.souhaits;
	}

}
