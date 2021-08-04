package hw8Q3UseOfSuper01;

public class TestFamily {

	public static void main(String[] args) {
		Father father = new Father();
		System.out.println("-------------------");

		Father father2 = new Father("Matin", 65, 'M', true);
		System.out.println("-------------");

		father2.father();
		System.out.println("----------");

		father2.fatherInfo("John", 45, 'M', false);

		System.out.println("\n--------------------");

		Son son = new Son();

		System.out.println("-----");
		Son son1 = new Son(56, 'D');
		System.out.println("--------------");
		son1.son();
		System.out.println("-------------");

		son1.sonInfo(23, 'M');

	}

}
