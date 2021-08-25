package hw8Q6Abstraction03;

public class ColumbiaUniversity extends MedicalSchool implements University,VocationalSchool {
	

	/*
	 * public abstract void chemistry()....we can't declare/implement any abstract
	 * method In a regular class
	 */

	public void biology() {
		System.out.println("This is a non abstract method");

	}

	// default constructor
	public void ColumbiaUniversity() {

	}
	/*
	 * Questions: how many keywords are used for the inheritance for a regular
	 * Class? Can a regular Class inherit other Abstract Class or regular class or
	 * interface? How many inheritances is possible by a regular Class?
	 */

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void field() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}

}

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
