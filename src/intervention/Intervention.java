package intervention;

import misc.CasualValue;

abstract class Intervention {

	private CasualValue<String> volume;

	public String getVolume() {
		return (this.volume.getValue());
	}

	public void setVolume(String v) {
		this.volume.setValue(v);
	}
	
	
}
