package h_Oop;

public class Dial {
	private int setting;
	private int minVal;
	private int maxVal;
	
	public Dial(int setting, int minVal, int maxVal){
		setMinVal(minVal);
		setMaxVal(maxVal);
		setSetting(setting);
	}

	public int getSetting() {
		return setting;
	}

	public void setSetting(int setting) {
		this.setting = Math.min(maxVal, Math.max(minVal, setting));
	}

	public int getMinVal() {
		return minVal;
	}

	public void setMinVal(int minVal) {
		this.minVal = minVal;
	}

	public int getMaxVal() {
		return maxVal;
	}

	public void setMaxVal(int maxVal) {
		this.maxVal = maxVal;
	}
	
}
