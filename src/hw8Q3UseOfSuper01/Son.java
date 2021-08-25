package hw8Q3UseOfSuper01;

public class Son extends Father {
	public int id;
	public char grade;

	public Son() {

		super("Shakir", 29, 'M', true);  //parameterized constructor
		super.father();
		super.fatherInfo("Jahad", 420, 'D', false);
		super.FamilyName = "Hussain";
		System.out.println("Name : " + Name + "\nAge :" + age + "\nSex:" + sex + "\nCitizen" + usCitizen
				+ "\nFamily Name: " + FamilyName);
		System.out.println("Default Constructor");
	}

	public Son(int id, char grade) {
		super();// initialize default Constructor from father class
		super.father();
		super.fatherInfo("Shah", 23, 'D', false);
		super.FamilyName = "Hussain";
		this.id = id;
		this.grade = grade;
		System.out.println("ID : " + id + "Grade : " + grade);
	}

	public void son() {
		super.father();
		super.fatherInfo("Jahad", 420, 'D', false);
		super.FamilyName = "hussain";
		System.out.println("Regular Method");

	}

	public void sonInfo(int id, char grade) {
		this.id = id;
		this.grade = grade;
		super.father();
		super.fatherInfo("Jahad", 420, 'D', false);
		super.FamilyName = "hussain";

		System.out.println("parametrized method");

	}

}
