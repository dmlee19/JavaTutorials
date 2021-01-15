/**
 * �佺�� ����
 * �佺�� ���� ȸ�翡�� �佺���� ���� ����
 * ���� �ý���: ���� ���� ���۾�ü���� ���ϴ� ��ǰ �����ؼ� ����
 * ���� ���� ���̾�: ���̾� ���� ���۾�ü���� ���ϴ� ��ǰ �����ؼ� ����
 */

package h_Oop;

public class Toaster {
	private int nSlots; // �ּ� 1, �ִ� 4
	private int nSlices;
	
	// PowerSupply Class
	// private int voltage; // 110V �Ǵ� 220V
	// private boolean turnedOn;
	private PowerSupply power;
	
	// Dial Class 
	//private int darkness;
	private Dial darkness;
	
	public Toaster(int nSlots, int voltage){
		setnSlots(nSlots);
		nSlices = 0;
		this.power = new PowerSupply(voltage);
		//setVoltage(voltage);
		// turnedOn = false;
		this.darkness = new Dial(1, 1, 10); //�ʱ� ���� 1, 1~10 �������� 
		// darkness = 1;
	}

	public int getnSlots() {
		return nSlots;
	}

	public void setnSlots(int nSlots) {
		this.nSlots = Math.max(1, Math.min(4, nSlots));
	}

	public int getnSlices() {
		return nSlices;
	}
	
	public void setnSlices(int nSlices) {
		this.nSlices = Math.min(nSlots, Math.abs(nSlices));
	}

//	public int getVoltage() {
//		return voltage;
//	}

//	public void setVoltage(int voltage) {
//		if(voltage == 110 || voltage == 220){
//			this.voltage = voltage;
//		}else{
//			this.voltage = 110;
//		}
//	}

//	public boolean getTurnedOn() {
//		return turnedOn;
//	}
	
//	public void setTurnedOn(boolean turnedOn) {
//		this.turnedOn = turnedOn;
//	}

//	public void turnOn(){
//		setTurnedOn(true);
//	}
	
//	public void turnOff(){
//		setTurnedOn(false);
//	}
	
	public PowerSupply getPower() {
		return power;
	}
	
	public void setPower(PowerSupply power) {
		this.power = power;
	}

//	public int getDarkness() {
//		return darkness;
//	}

//	public void setDarkness(int darkness) {
//		this.darkness = darkness;
//	}
	
	public Dial getDarkness() {
		return darkness;
	}
	
	public void setDarkness(Dial darkness) {
		this.darkness = darkness;
	}
	
	public void insertBread(int n){
		if(power.getTurnedOn()){
			setnSlices(nSlices+n);
		}
	}
	
	public void popBread(){
		if(power.getTurnedOn()){
			setnSlices(0);
		}
	}
	
	public String toString(){
		return String.format("%d slot %dV toaster with %d slice%s at darkness %d: %s",
				nSlots, power.getVoltage(), nSlices, ((nSlices == 1)? "" : "s"), darkness.getSetting(),
				((power.getTurnedOn())? "ON" : "OFF"));
	}
}

