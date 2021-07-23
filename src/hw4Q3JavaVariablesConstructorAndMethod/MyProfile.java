package hw4Q3JavaVariablesConstructorAndMethod;

public class MyProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int a=10;
        char b='z';
        float c=56f;
        double d=10.72;
        long e=45;
        boolean f =true;
        byte g=7;
        short h=9;
        
        MyProfile profile = new MyProfile();
        profile.mymethod();
       
	}
	//default constructor
	public MyProfile() {
		System.out.println("Default constructor");
	}
	
	public void mymethod()
	   {
	      System.out.println("Void method of the class");
	   }
 
}
