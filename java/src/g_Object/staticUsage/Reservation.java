/**
 * Using Static Variable and Methods 
 * Ŭ�������� ���ԵǸ� Ŭ������ ���� ������ ��� �ν��Ͻ����� ���Ե��� �ʴ� ���� �����ϴ� ��� 
 * Instance methods and properties: object�� �����Ҷ����� �ٸ��� ���� �Ǵ� ��
 * Static: �����Ǵ� instance�� ������� �������� methods and properties.
 */

package g_Object.staticUsage;

public class Reservation {
	String room;
	int day;
	static int nReservations = 0;
	static final String[] dayName = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	// final �ٲ��� �ʴ´�.
	
	Reservation(String newRoom, int newDay){
		room = newRoom;
		day = newDay;
		nReservations++; // �����ڰ� ����ɶ����� ������ڰ� 1�� ����
	}

	void show(){
		System.out.printf("Room %s reserved on %s.\n", room, dayName[day]);
	}
	
	// shows number of reservation 
	static void showNReservations(){
		System.out.printf("Number of reservations created is: %d.\n", nReservations);
	}
	
	// �ν��Ͻ� method���� static property, method ȣ�� ���� 
	void good(){
		System.out.println(nReservations);
		showNReservations();
	}
	
	// static method���� �ν��Ͻ� property, method ȣ�� �Ұ�
//	static void bad(){
//		System.out.println(room);
//		show();
//	}
	
}
