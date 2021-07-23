package hw6Q4Abstraction01;

public abstract class NursingSchool {
//hygiene and caring
	public abstract void hygiene();

	public void caring() {
		System.out.println("this is nonabstract method");
	}

	// default costructor
	public void NursingSchool() {

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
}
