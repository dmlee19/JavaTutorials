package h_Oop.inheritancePolymorphism;

public class Triangle extends GeometricObject{
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle(){
		super();
		sideA = 1.0;
		sideB = 1.0;
		sideC = 1.0;
	}

	public Triangle(double sideA, double sideB, double sideC, String color, boolean filled){
		super(color, filled);
		setSideA(sideA);
		setSideB(sideB);
		setSideC(sideC);

	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	// Polymorphism_1
	@Override
	public double getArea() {
		double s = (sideA + sideB + sideC) / 2.0; // semi-perimeter
		double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
		return area;
	}

	@Override
	public double getPerimeter() {
		return sideA + sideB + sideC;
	}
	
	// Polymorphism_2
	public double[] getAngles(){
		// 각 변의 마주모는 각
		double[] result = {
				Math.acos((sideB * sideB + sideC * sideC - sideA * sideA)/(2.0 * sideB * sideC)),
				Math.acos((sideA * sideA + sideC * sideC - sideB * sideB)/(2.0 * sideA * sideC)),
				Math.acos((sideA * sideA + sideB * sideB - sideC * sideC)/(2.0 * sideA * sideB))
		};
		return result;
	}
	
	public String toString(){
		return ("Triangle with sides: " + sideA + ", "+ sideB + " and "+ sideC +
				", Color: " + getColor() + ", Filled: " + isFilled());
	}
}