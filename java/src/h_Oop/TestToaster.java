package h_Oop;

public class TestToaster {

	public static void main(String[] args) {
		Toaster usTwoSlots = new Toaster(2, 110); // 2개 슬롯의 110V 토스터 제작
		Toaster korFourSlots = new Toaster(4, 220); // 4개 슬롯의 220V 토스터 제작
		
//		usTwoSlots.turnOn();
//		usTwoSlots.setDarkness(4);
//		usTwoSlots.insertBread(1);
		
		usTwoSlots.getPower().turnOn();			// 2 슬롯 토스터 전원 On
		usTwoSlots.getDarkness().setSetting(4); // 2 슬롯 토스터 다이얼 4단계로 조절
		usTwoSlots.insertBread(1);				// 2 슬롯 중 1개의 슬롯에 빵 넣음
		
		System.out.println(usTwoSlots);	
		// 2 slot 110V toaster with 1 slice at darkness 4: ON
		System.out.println(korFourSlots);
		// 4 slot 220V toaster with 0 slices at darkness 1: OFF
	}

}
