package hw5Q3variableAndMethod;

public class TestComputer {

	public static void main(String[] args) {
		Computer computer = new Computer();

		computer.Brand = "Apple";
		computer.Model = "Macbook Air";
		computer.OperatingSystem = "MacOS Mojave";
		computer.price = 800;
		computer.madeInUsa = false;
		computer.configuration();

		Computer shakirComputer = new Computer();
		shakirComputer.Brand = "Dell";
		shakirComputer.Model = "Core I7";
		shakirComputer.OperatingSystem = "Windows";
		shakirComputer.price = 1700;
		shakirComputer.madeInUsa = true;
		shakirComputer.grade = 'A';
		shakirComputer.configuration();

	}
}
