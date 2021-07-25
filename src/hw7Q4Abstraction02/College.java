package hw7Q4Abstraction02;

public interface College {
//commonRoom, laboratory, languageClub
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm() {

	}

	public static void studyRoom() {

	}

	// we can't create any constructor inside an interface.

	/*
	 * Questions How many keywords are used for the inheritance in Java? how many
	 * keywords are used for the inheritance in Interface, answer by Java comments?
	 * if you can use the keyword 'implements' in Interface, please use it. Use all
	 * the interfaces -- University, Hospital, and College
	 */
	/*
	 * Answers 2 keywords (extends/implements) are used for the inheritance in java
	 * 1 keyword (implements) used for inherit an interface. we cant use the word
	 * "implements" in an Interface.
	 */

}
