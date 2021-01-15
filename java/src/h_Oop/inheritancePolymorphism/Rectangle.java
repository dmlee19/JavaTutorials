/**
 * This class describes a Rectangle, a subclass of class GeometricObject,
 * which has a width, height and methods for calculating area and perimeter.
 */

package h_Oop.inheritancePolymorphism;

public class Rectangle extends GeometricObject{
	private double width;
	private double height;
	
	public Rectangle(){
		// setColor("white");
		// setFilled(false);
		// No Augment super class constructor
		super();
		width = 1.0;
		height = 1.0;
	}
	
	public Rectangle(double width, double height, String color, boolean filled){
		// setColor(color);
		// setFilled(filled);
		// Multiple Augments super class constructor
		super(color, filled);
		setWidth(width);
		setHeight(height);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	// Polymorphism_1
	@Override
	public double getArea(){
		return width * height;
	}
	@Override
	public double getPerimeter(){
		return 2.0 * (width + height);
	}
	
	// Polymorphism_2
	public double getDiagonal(){
		return Math.sqrt(width * width + height * height);
	}
	
	public String toString(){
		return ("Rectangle with dimension: " + width + " X " + height + 
				", Color: " + getColor() + ", Filled: " + isFilled());
	}
	
}
