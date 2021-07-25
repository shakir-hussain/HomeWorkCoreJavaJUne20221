package hw6Q3Inheritance;

public class TestAnimal {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		Birds birds = new Birds();
		birds.birdsInfo();
		birds.mammalInfo();

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		Robin robin = new Robin();
		robin.robinInfo();
		robin.animalInfo();
		robin.mammalInfo();
		robin.birdsInfo();

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.animalInfo();
		snake.reptileInfo();

	}
}
