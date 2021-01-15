/**
 * Chaining Constructors
 */

package h_Oop.chainingConstructor;

public class TestBrushes {

	public static void main(String[] args) {
		ElectricToothbrush electricOne = new ElectricToothbrush();
	// case 1)
		// Zero-augment constructor for Brush
		// Zero-augment constructor for Toothbrush
		// Zero-augment constructor for ElectricToothbrush
		
	// case 2) 	
		// Zero-augment constructor for Brush
		// One-augment constructor for Toothbrush
		// Zero-augment constructor for ElectricToothbrush
		
		System.out.println("=========");
		
		ElectricToothbrush electricTwo = new ElectricToothbrush("AA");
	// case 1), case 2)
		// Zero-augment constructor for Brush
		// Zero-augment constructor for Toothbrush
		// one-augment constructor for ElectricToothbrush
		
		// ==> Toothbrush Zero-augment constructor가 없으면 애러 발생.
		
	}

}
