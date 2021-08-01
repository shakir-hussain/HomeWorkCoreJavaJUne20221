package hw5Q4Constructor;

public class TestComputer {

	public static void main(String[] args) {
		Computer computer = new Computer();// default constructor initialized
		Computer computer1 = new Computer("Apple", "Macbook Air", "MacOS Mojave", 800, false, 'C'); // 2
		Computer shakir = new Computer("Dell", "Core I7", "Windows", 1700, true, 'A'); // 3
		Computer computer2 = new Computer("HP");
		Computer computer5 = new Computer("HP", "Windows", 700);
		Computer computer6 = new Computer("Lenovo", "ThinPad", "Windows", 800, false);

	}

}
