package hw8Q6Abstraction03;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {
//maths and statistics
	// public abstract void maths()...we can't create an abstract method in class.

	public void statistics() {
		System.out.println("non abstract method");

	}

	// default constructor
	public void RockefellerUniversity() {

	}

	@Override
	public void aeronauticalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mechanicalLab() {
		// TODO Auto-generated method stub
		
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

	// HW7
	/*
	 * Questions: how many keywords are used for the inheritance in Java for a
	 * regular Class? Can an regular Class inherit other Abstract Class or a regular
	 * class or interface? How many inheritances is possible by a regular Class? Use
	 * the all of above regular Classes
	 */

	/*
	 * Answers: 1 keyword is used for the inheritance in Java for a regular Class.
	 * Yes an regular class can inherit other Abstract Class or a regular class by
	 * the keyword extends.And to inherit the interface we use the keyword
	 * implements. 1 Inheritance is possible by a regular class.
	 */
}
