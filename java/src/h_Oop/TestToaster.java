package h_Oop;

public class TestToaster {

	public static void main(String[] args) {
		Toaster usTwoSlots = new Toaster(2, 110); // 2�� ������ 110V �佺�� ����
		Toaster korFourSlots = new Toaster(4, 220); // 4�� ������ 220V �佺�� ����
		
//		usTwoSlots.turnOn();
//		usTwoSlots.setDarkness(4);
//		usTwoSlots.insertBread(1);
		
		usTwoSlots.getPower().turnOn();			// 2 ���� �佺�� ���� On
		usTwoSlots.getDarkness().setSetting(4); // 2 ���� �佺�� ���̾� 4�ܰ�� ����
		usTwoSlots.insertBread(1);				// 2 ���� �� 1���� ���Կ� �� ����
		
		System.out.println(usTwoSlots);	
		// 2 slot 110V toaster with 1 slice at darkness 4: ON
		System.out.println(korFourSlots);
		// 4 slot 220V toaster with 0 slices at darkness 1: OFF
	}

}
