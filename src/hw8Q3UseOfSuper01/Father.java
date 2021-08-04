package hw8Q3UseOfSuper01;


public class Father {

	public String Name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String FamilyName;

	public Father() {
		System.out.println("Default Constructor");

	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		this.Name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name : "+name+" Age :"+age+ " Sex :"+sex+" Citizen : "+usCitizen);

	}

	public void father() {
		System.out.println("Void method");
	}

	public void fatherInfo(String Name, int age, char sex, boolean usCitizen) {
		this.Name=Name;
		this.age=age;
		this.sex=sex;
		this.usCitizen = usCitizen;
		
		System.out.println("Name:" + Name + "\nAge" + age + "\nSex" + sex + "\nCitizen" + usCitizen);

	}

}
