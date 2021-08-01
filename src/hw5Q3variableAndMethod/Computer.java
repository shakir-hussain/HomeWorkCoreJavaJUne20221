package hw5Q3variableAndMethod;

public class Computer {

	public String Brand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public boolean madeInUsa;
	public char grade;

	public void configuration() {
		System.out.println("Brand name:" + Brand + "\nModel" + Model + "\nOperating System:" + OperatingSystem
				+ "\nPrice:" + price + "\nMade In Usa:" + madeInUsa + "\nGrade:" + grade+"\n--------");

	}

}
