/**
 * This class describes a Circle, a subclass of class GeometricObject,
 * which has a radius and methods for calculating area and circumference.
 */

package h_Oop.inheritancePolymorphism;

public class Circle extends GeometricObject{
	private double radius;
	
	public Circle(){
		// GeometricObject �����ڿ� �ߺ�
		// setColor("white");
		// setFilled(false);
		
		// No Augment super class constructor
		super();
		radius = 1.0;
	}
	//
	public Circle(double radius, String color, boolean filled){
		// GeometricObject �����ڿ� �ߺ�
		// setColor(color);	// this.color = color ��� �Ұ�(private ��ӵ� ���� X)
		// setFilled(filled);	// this.filled = filled ��� �Ұ� (private ��ӵ� ���� X) 
		
		// Multiple Augments super class constructor
		super(color, filled);
		setRadius(radius); // this.radius = radius; ��� ���� 
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Polymorphism_1
	@Override
	public double getArea(){
		return Math.PI * radius * radius;
	}
	
	@Override
	public double getPerimeter(){
		return 2.0 * Math.PI * radius;
	}
	
	//Polymorphism_2
	public double getCircumference(){
		return 2.0 * Math.PI * radius;
	}
	
	public double getDiameter(){
		return 2.0 * radius;
	}	
	
	public String toString(){
		return ("Circle with radius: " + radius + ", "+ "Color: " + getColor() + ", Filled: " + isFilled());
	}
}
