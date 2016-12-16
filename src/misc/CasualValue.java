package misc;

public class CasualValue<T> {
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
		return(this.value != null);
	}
	

}
