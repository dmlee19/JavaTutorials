package f_Array.object;

public class TestElement {

	public static void main(String[] args) {
//		Element hydrogen = new Element("hydrogen" , "H", 1.008, 1, 1);
//		Element helium = new Element("helium" , "He", 4.0026, 1, 18);
//		Element lithium = new Element("lithium" , "Li", 6.94, 2, 1);
//		Element beryllium = new Element("beryllium" , "Be", 9.0122, 2, 2);
//
//		double totalWeight = hydrogen.getWeight() + helium.getWeight() 
//			+ lithium.getWeight() + beryllium.getWeight();
//		double averageWeight = totalWeight / 4;
//		System.out.printf("Average atomic weight: %.3f\n",averageWeight); // Average atomic weight: 5.241
	
		// Element가 많아지면 어떻게 하는게 좋을까 ? 
		// 3 번
		Element[] chemicals = {
				new Element("hydrogen" , "H", 1.008, 1, 1),
				new Element("helium" , "He", 4.0026, 1, 18),
				new Element("lithium" , "Li", 6.94, 2, 1),
				new Element("beryllium" , "Be", 9.0122, 2, 2)
		};
		// 1, 2, 공통
//		Element hydrogen = new Element("hydrogen" , "H", 1.008, 1, 1);
//		Element helium = new Element("helium" , "He", 4.0026, 1, 18);
//		Element lithium = new Element("lithium" , "Li", 6.94, 2, 1);
//		Element beryllium = new Element("beryllium" , "Be", 9.0122, 2, 2);
		// 1 번
//		Element[] chemicals = new Element[4];
//		
//		chemicals[0] = hydrogen;
//		chemicals[1] = helium;
//		chemicals[2] = lithium;
//		chemicals[3] = beryllium;
//		// 2 번
//		Element[] chemicals = {hydrogen, helium, lithium, beryllium};
		
		double totalWeight = 0.0;

//		for (int i = 0; i < chemicals.length; i++) {
//			totalWeight += chemicals[i].getWeight();
//		}
		
		for (Element el: chemicals){
			totalWeight += el.getWeight();
		}
		
		double averageWeight = totalWeight / chemicals.length;
		System.out.printf("Average atomic weight: %.3f\n",averageWeight); // Average atomic weight: 5.241
	}//main
}
