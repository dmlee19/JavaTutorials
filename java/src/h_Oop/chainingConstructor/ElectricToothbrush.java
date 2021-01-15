package h_Oop.chainingConstructor;

public class ElectricToothbrush extends Toothbrush {
	private String batterySize;

	public ElectricToothbrush() {
	// case 1)
		// super(); ��� �⺻���� ȣ��
		// 3��°�� ����
	// case2) one-augment constructor ȣ��
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
