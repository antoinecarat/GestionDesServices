package intervention;

import misc.CasualValue;

public abstract class Intervention {

	private CasualValue<String> volume;

	public String getVolume() {
		return (this.volume.getValue());
	}

	public void setVolume(String v) {
		this.volume.setValue(v);
	}
	
	
}
