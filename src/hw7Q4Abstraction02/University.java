package hw7Q4Abstraction02;

public interface University {
//classSize, field, and teacher.
	public void classSize();

	public void field();

	public void teacher();

	public static void gymnasium() {

	}

	public default void library() {

	}

	// we can't create any constructor inside an interface.

	/*
	 * we cannot call the methods in the interface, there is no need for creating
	 * the object for interface and there is no need of having a constructor. 1
	 * keyword (extends) are used for the inheritance for Interface. Interface can
	 * inherit more than one interface but can't inherit a regular class or abstract
	 * class. More than one inheritances is possible by an Abstract Class.
	 */

}
