package hw9Q3Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
System.out.println("-------instantiating sister class---------");
		Sister sister=new Sister();
		sister.ageOfSisters();
		sister.ageOfSisters(2,3,15,34,20);
		sister.ageOfSisters(23,14,"32");
		Sister.ageOfSisters(6,8,32);
		sister.ageOfSisters(45,33);
		
		
		System.out.println("--------Niece class instantiated--------");
		Niece niece=new Niece();
		niece.ageOfSisters();
		niece.ageOfSisters(2,3,15,34,20);
		niece.ageOfSisters(23,14,"32");
		Niece.ageOfSisters(6,8,32);
				

	}

}
