package h_Oop;

public class PowerSupply {
	private int voltage;
	private boolean turnedOn;
	
	public PowerSupply(int voltage){
		setVoltage(voltage);
		turnedOn = false;
	}

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		if(voltage == 110 || voltage == 220){
			this.voltage = voltage;
		}else{
			this.voltage = 110;
		}
	}

	public boolean getTurnedOn() {
		return turnedOn;
	}

	public void setTurnedOn(boolean turnedOn) {
		this.turnedOn = turnedOn;
	}

	public void turnOn(){
		setTurnedOn(true);
	}
	
	public void turnOff(){
		setTurnedOn(false);
	}
}
