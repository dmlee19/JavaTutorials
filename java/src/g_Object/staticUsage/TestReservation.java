package g_Object.staticUsage;

public class TestReservation {

	public static void main(String[] args) {
		Reservation r1 = new Reservation("SA114", 0);
		Reservation r2 = new Reservation("RF241", 3);
		
		r1.show();	// Room SA114 reserved on Monday.
		r2.show();	// Room RF241 reserved on Thursday.
		Reservation.showNReservations(); // static method --> class에 속해있다.
		// instance 이름으로 불러오지 않는다.
		// Number of reservations created is: 2.
	}//main
	
}
