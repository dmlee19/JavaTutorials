/**
 * This class describes a generic geometric object
 * that has a color can can be filled with that color.
 */

package h_Oop.inheritancePolymorphism;

public class GeometricObject {
	private String color;
	private boolean filled;
	
	public GeometricObject(){
		color = "white";
		filled = false;
	}
	
	public GeometricObject(String color, boolean filled){
		setColor(color);
		setFilled(filled);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	// Polymorphism
	public double getArea(){
		return 0.0;
	}
	// Polymorphism
	public double getPerimeter(){
		return 0.0;
	}
	
	public String toString(){
		return "Color: " + color + ", Filled: " + filled;
	}
}
