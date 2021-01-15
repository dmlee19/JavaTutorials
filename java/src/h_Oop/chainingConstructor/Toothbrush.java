package h_Oop.chainingConstructor;

public class Toothbrush extends Brush {
	private String bristleType;

	public Toothbrush() {
	// case 1)	
		// super(); ��� �⺻���� ȣ��
		// 2��°�� ����
		System.out.println("Zero-augment constructor for Toothbrush");
		bristleType = "medium";
	}
	
	public Toothbrush(String bristleType) {
	// case 2)
		// super(); ��� �⺻���� ȣ��
		System.out.println("One-augment constructor for Toothbrush");
		setBristleType(bristleType);
	}

	public String getBristleType() {
		return bristleType;
	}

	public void setBristleType(String bristleType) {
		this.bristleType = bristleType;
	}
	
	
}
