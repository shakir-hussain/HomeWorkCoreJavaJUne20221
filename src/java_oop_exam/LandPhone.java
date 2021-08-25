package java_oop_exam;
//When you get a chance to implement interfaceInfo, 
	// * print out answers for the following questions: [What are the features of
	// Interface you know? Can we create a constructor
	/*
	 * inside an interface? Can we write variables inside Interface? Don't
	 * copy-paste, write how much you can remember, use newline (\n), tab(\t)], for
	 * other abstract methods which will be implemented, also print whatever you
	 * like. Do you think we can extends or implements Interface? Single or
	 * multiple? Create two interface Pager and Wakitaki (Phone interface inherit
	 * them) and One regular class name LandPhone and one abstract class
	 * SatelitePhone. make a relation of this 4, with Phone if possible. [points:
	 * 70] .
	 */
//a regular class inheriting an interface..Phone is the parent class 
public class LandPhone extends SatelitePhone {

	@Override
	public void interfaceInfo() {
		System.out.println("We cant create an object of an interface "
				+ "\nWe cant Create an constructor inside an interface" + "\nWe cannot write variables inside"
				+ "an interface" + "\n All the declared methods in an interface are abstract in nature");

	}

	@Override
	public void call() {
		System.out.println(
				"An interface can only inherit other interfaces by extends keyword(multiple interface can be inherited)."
						+ "\nAbstract and regular class inherits interface only by implements keyword");

	}

	@Override
	public void message() {
		System.out.println("Only static and default method can be implemented inside an interface");

	}

	@Override
	public void camera() {
		System.out.println("this method is from Phone interface");

	}


	
	
}
