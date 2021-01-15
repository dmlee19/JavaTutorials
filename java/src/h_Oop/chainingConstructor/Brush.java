package h_Oop.chainingConstructor;

public class Brush {
	private String color;
	
	public Brush(){
	// case 1) 1 ��°�� ����
	// case 2) 1 ��°�� ����
		System.out.println("Zero-augment constructor for Brush");
		color = "green";
	}
	public Brush(String color){
		System.out.println("One-augment constructor for Brush");
		setColor(color);
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
