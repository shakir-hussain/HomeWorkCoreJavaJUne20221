package hw9Q3Polymorphism;
/*"hw9Q3Polymorphism" inside your HW project and execute the remaining. Read the question very
 *  carefully. Create a class Sister. Can you create several methods with the same name
 *   inside it? Give the method name ageOfSisters. As a variable, use int age1, int age2, int age3, 
 *   String age4, int age5, int age6 etc in different combination. Use void type, parameterized type, 
 *   return type, static type, final type method by different combinations of the above variable. 
 *   Tell me what is the Method overloading. initialize all the methods in TestFamily class. 
 *   Create another class Niece and inherit Sister. Override all the possible methods by 
 *   changing logic. If some methods are not possible to override, please explain why by comments.
 *    Initialize all the methods in TestFamily class.*/
public class Sister {

	public void ageOfSisters() {
		System.out.println("This is void type method");
	}
	//parameterized  return type method 
	public  int ageOfSisters(int age1, int age2, int age3, int age5, int age6) {
		int totalage=age1+age2+age3+age5+age6;
		System.out.println("Total age of sisters = "+totalage);
		return totalage;
		
	}
	
}
