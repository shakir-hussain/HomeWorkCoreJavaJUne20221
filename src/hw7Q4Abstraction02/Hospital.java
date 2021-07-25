package hw7Q4Abstraction02;

public interface Hospital {
//emergencyRoom, surgeryRoom, cafeteria
	public void emergencyRoom();
	public void surgeryRoom();
	public void cafeteria();
	
	public default  void morgue() {
		
	}
	public static void pharmacy() {
		
	}
	
	////we can't create any constructor inside an interface.
		
	
}
