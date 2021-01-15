/**
 * Using Static Variable and Methods 
 * 클래스에만 포함되며 클래스로 부터 생성된 어떠한 인스턴스에도 포함되지 않는 값을 설정하는 경우 
 * Instance methods and properties: object를 생성할때마다 다르게 설정 되는 값
 * Static: 생성되는 instance와 상관없이 독립적인 methods and properties.
 */

package g_Object.staticUsage;

public class Reservation {
	String room;
	int day;
	static int nReservations = 0;
	static final String[] dayName = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	// final 바뀌지 않는다.
	
	Reservation(String newRoom, int newDay){
		room = newRoom;
		day = newDay;
		nReservations++; // 생성자가 실행될때마다 예약숫자가 1씩 증가
	}

	void show(){
		System.out.printf("Room %s reserved on %s.\n", room, dayName[day]);
	}
	
	// shows number of reservation 
	static void showNReservations(){
		System.out.printf("Number of reservations created is: %d.\n", nReservations);
	}
	
	// 인스턴스 method에서 static property, method 호출 가능 
	void good(){
		System.out.println(nReservations);
		showNReservations();
	}
	
	// static method에서 인스턴스 property, method 호출 불가
//	static void bad(){
//		System.out.println(room);
//		show();
//	}
	
}
