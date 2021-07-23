package hw6Q4Abstraction01;

public class NYUniversity {
//anthropology and physics

	// public abstract void anthropology()...we can't create an abstract method in a
	// regular class

	public void physics() {
		System.out.println("we can only implement a non abstract method in a regular class");

	}

	// default constructor
	public void NYUniversity() {

	}

	/*
	 * Questions: how many keywords are used for the inheritance for a regular
	 * Class? Can a regular Class inherit other Abstract Class or regular class or
	 * interface? How many inheritances is possible by a regular Class?
	 */

	/*
	 * Answers: One keyword is used to inherit for a regular class Regular class
	 * only inherit regular class,but not interface or abstract class Only one
	 * inheritance is possible by a regular Class
	 */
}
