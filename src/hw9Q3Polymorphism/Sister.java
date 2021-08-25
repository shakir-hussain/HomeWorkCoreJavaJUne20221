package hw9Q3Polymorphism;

public class Sister {
//Method overloading means we can create multiple methods with same method name but with different
	//parameter or signature assign inside the parenthesis
	
	
	
	public void ageOfSisters() {
		System.out.println("This is void type method");
	}
	//parameterized  return type method 
	public  int ageOfSisters(int age1, int age2, int age3, int age5, int age6) {
		int totalage1=age1+age2+age3+age5+age6;
		System.out.println("Total age of sisters1 = "+totalage1);
		return totalage1;
		
	}
	public int ageOfSisters (int age1,int age3,String age4) {
		int totalage2=age1+age3+Integer.parseInt(age4);
		System.out.println("Total age of sisters3 = "+totalage2);
		return totalage2;
		
		}
	public static int ageOfSisters(int age1,int age3,int age5) {
		int totalage3=age1+age3+age5;
		System.out.println("Total age of sisters4 = "+totalage3);
		return totalage3;
	}
	public final int ageOfSisters(int age1,int age3) {
		int totalage4=age1+age3;
		System.out.println("Total age of sisters5 = "+totalage4);
		return totalage4;
	}

	
}
