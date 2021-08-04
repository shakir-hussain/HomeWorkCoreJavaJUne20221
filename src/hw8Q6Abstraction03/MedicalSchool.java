package hw8Q6Abstraction03;

public abstract class MedicalSchool extends NursingSchool{

	public abstract void anatomyLab(); // method declared

	public void biochemistryLab() { // method implemented
		System.out.println("This is non abstract method");
	}

	// default costructor
	public void MedicalSchool() {

	}

	/*
	 * Question how many keywords are used for the inheritance of Abstract Class?
	 * Can an Abstract Class inherit other Abstract Class or a regular class or
	 * interface? How many inheritances is possible by an Abstract Class?
	 */

	/*
	 * Answer one keyword(extends) is used for inheritance of abstract class An
	 * abstract class can inherit a regular class and abstract class but cant
	 * inherit an interface. Only one inheritance is possible by an Abstract Class
	 */

	/*
	 * Questions how many keywords are used for the inheritance in Java for Abstract
	 * Class? Can an Abstract Class inherit other Abstract Class or a regular class
	 * or interface? How many inheritances is possible by an Abstract Class? Use the
	 * all of above Abstract Classes and use the keywords to answer my questions
	 */

	/*
	 * Answers 1 keyword used for inheritance in java for abstract classes. Yes an
	 * abstract class can inherit other abstract class or a regular class but can't
	 * inherit an interface. 1 inheritance is possible by an abstract class with
	 * extends keyword
	 */
}
