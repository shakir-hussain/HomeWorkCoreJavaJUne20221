package hw5Q4Constructor;

public class Computer {

	public String Brand;
	public String model;
	public String OperatingSystem;
	public int price;
	public boolean madeInUsa;
	public char grade;

	// 1
	public Computer() {
		System.out.println("This is a default Constructor\n-------------");
	}

	// 2
	public Computer(String brand, String model, String operatingSystem, int price, boolean madeInUsa, char grade) {
		this.Brand = brand;
		this.model = model;
		this.OperatingSystem = operatingSystem;
		this.price = price;
		this.madeInUsa = madeInUsa;
		this.grade = grade;
		System.out.println("Brand name:" + brand + "\nModel:" + model + "\nOperating System:" + operatingSystem
				+ "\nPrice :" + price + "\nMade in Usa:" + madeInUsa + "\nGrade:" + grade + "\n----------");
	}

	// 4
	public Computer(String brand) {
		this.Brand = brand;

		System.out.println("Brand:" + brand + "\n---------");
	}

	// 5
	public Computer(String brand, String operatingsystem, int price) {
		this.Brand = brand;
		this.OperatingSystem = operatingsystem;
		this.price = price;
		System.out
				.println("Brand:" + brand + "\nOperating System:" + operatingsystem + "\nPrice:" + price + "\n-------");

	}

//6
	public Computer(String brand, String model, String operatingSystem, int price, boolean madeInUsa) {
		this.Brand = brand;
		this.model = model;
		this.OperatingSystem = operatingSystem;
		this.price = price;
		this.madeInUsa = madeInUsa;
		System.out.println("Brand name:" + brand + "\nModel:" + model + "\nOperating System:" + operatingSystem
				+ "\nPrice :" + price + "\nMade in Usa:" + madeInUsa);

	}

}
