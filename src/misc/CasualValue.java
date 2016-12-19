package misc;

import java.io.Serializable;

public class CasualValue<T> implements Serializable{
	private static final long serialVersionUID = 2468951375864851379L;
	
	private T value;
	
	public CasualValue(){
		this.value = null;
	};
	
	public CasualValue(T v) {
		this.value = v;
	}
	
	public T getValue() {
		return this.value;
	}
	
	public void setValue(T v) {
		this.value = v;
	}
	
	boolean hasValue(){
		return (this.value != null);
	}
	

}
