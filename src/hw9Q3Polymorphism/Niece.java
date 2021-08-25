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
public class Niece extends Sister{
    @Override
	public void ageOfSisters() {
		System.out.println("This is void type method from niece class");
	}
	//parameterized  return type method 
    @Override
	public  int ageOfSisters(int age1, int age2, int age3, int age5, int age6) {
		int totalage1=age1+age2+age3+age5+age6+78;
		System.out.println("Total age of sisters1 = "+totalage1);
		return totalage1;
		
	}@Override
	public int ageOfSisters (int age1,int age3,String age4) {
		int totalage2=age1+age3+Integer.parseInt(age4)+4;
		System.out.println("Total age of sisters3 = "+totalage2);
		return totalage2;
		
		}
	public static int ageOfSisters(int age1,int age3,int age5) {
		int totalage3=age1+age3+age5+7;
		System.out.println("Total age of sisters4 = "+totalage3);
		return totalage3;
	}
	//we cant override a final method ,because its already final to the parent class(Sister class)
	
	/*
	@Override
	public final int ageOfSisters(int age1,int age3) {
		int totalage4=age1+age3;
		System.out.println("Total age of sisters = "+totalage4);
		return totalage4;
	}*/

}
