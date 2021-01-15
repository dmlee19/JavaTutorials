package h_Oop.chainingConstructor;

public class Toothbrush extends Brush {
	private String bristleType;

	public Toothbrush() {
	// case 1)	
		// super(); 없어도 기본으로 호출
		// 2번째로 실행
		System.out.println("Zero-augment constructor for Toothbrush");
		bristleType = "medium";
	}
	
	public Toothbrush(String bristleType) {
	// case 2)
		// super(); 없어도 기본으로 호출
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
