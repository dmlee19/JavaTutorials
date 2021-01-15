package h_Oop.chainingConstructor;

public class ElectricToothbrush extends Toothbrush {
	private String batterySize;

	public ElectricToothbrush() {
	// case 1)
		// super(); 없어도 기본으로 호출
		// 3번째로 실행
	// case2) one-augment constructor 호출
		super("soft");  
		System.out.println("Zero-augment constructor for ElectricToothbrush");
		batterySize = "AA";
	}

	public ElectricToothbrush(String batterySize) {
		System.out.println("One-augment constructor for ElectricToothbrush");
		setBatterySize(batterySize);
	}

	public String getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(String batterySize) {
		this.batterySize = batterySize;
	}
	

	
	
}
