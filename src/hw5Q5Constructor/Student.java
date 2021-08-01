package hw5Q5Constructor;


public class Student {

	public String Stname;
	public int stID;
	public char sex;
	public boolean programmer;
	public float grade;

	public Student() {
		System.out.println("This is from default Constructor of Student class"+"\n---------");
	}

	public Student(String stname, int stID, char sex) {

		this.Stname = stname;
		this.stID = stID;
		this.sex = sex;
		
		System.out.println("Student name:"+Stname+"\nStudent ID:"+stID+ "\nSex:"+sex);
		
	}

	public Student(String stname, int stID, char sex, float grade,boolean programmer) {
	
		Stname = stname;
		this.stID = stID;
		this.sex = sex;
		this.programmer = programmer;
		this.grade = grade;
		 
		System.out.println("Student name:"+Stname+"\nStudent ID:"+stID+ "\nSex:"+sex
				+"\nProgrammer:"+programmer+"\nGrade :"+grade+"\n--------");
	}
	


}
