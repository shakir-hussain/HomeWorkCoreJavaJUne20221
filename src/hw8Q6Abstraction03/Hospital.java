package hw8Q6Abstraction03;

public interface Hospital {

	public void emergencyRoom();
	public void surgeryRoom();
	public void cafeteria();
	
	public default  void morgue() {
		
	}
	public static void pharmacy() {
		
	}
	
	////we can't create any constructor inside an interface.
		
	
}
