package main;

import java.util.ArrayList;
import java.util.List;

import souhait.Souhait;

public class SouhaitServiceImpl implements SouhaitService {
	
	List<Souhait> souhaits = new ArrayList<Souhait>();

	@Override
<<<<<<< HEAD
	public void insertSouhait(Souhait s) {
=======
	public void insertStudent(Souhait s) {
>>>>>>> dc9b8c6996991325a88fa8f619628ce88682ad22
		souhaits.add(s);
	}

	@Override
	public List<Souhait> getSouhait() {
		return this.souhaits;
	}

}
