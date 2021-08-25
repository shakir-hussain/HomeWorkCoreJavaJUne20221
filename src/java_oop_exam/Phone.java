package java_oop_exam;

public interface Phone extends Pager, Wakitaki {
	// All the declared methods are abstract in nature in an interface.
	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	public default void battery() {
		System.out.println("battery is a default method from Java 1.8 version");

	}

	public static void wireless() {
		System.out.println("Wireless is a static  method from Java 1.8 version");
	}

}
