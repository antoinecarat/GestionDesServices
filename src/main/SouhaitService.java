package main;

import java.util.List;

import souhait.Souhait;

public interface SouhaitService {

	public void insertSouhait(Souhait s);

	public List<Souhait> getSouhait();
}
