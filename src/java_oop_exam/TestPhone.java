package java_oop_exam;

/*Create a method - regularClassInfo and print out all the features of a regular class compared with Interface and 
 * 
 * Abstract class you know. what is the relation between regular class, Abstract class and Interface? Can you make a
 *  relation of Iphone1 with Phone Interface and AppleWatch Abstract class. [Complete the code after answering above]
 *  . [points: 30] . Think about a class name TestPhone. Instantiate IPhone1, AppleWatch and Phone inside it. Call all the 
 *  possible method by each of them. Go to next step after finishing till this. */
public class TestPhone {

	public static void main(String[] args) {
		System.out.println("---Iphone1 instantiated----");
		Iphone1 iphone1 = new Iphone1();// default constructor initialized
		iphone1.regularClassInfo();
		iphone1.abstractClassInfo();
		iphone1.appleWatchInfo();
		iphone1.interfaceInfo();
		iphone1.call();
		iphone1.message();
		iphone1.camera();
		Phone.wireless();
		iphone1.battery();

		System.out.println("----AppleWatch instantiated----- ");
		AppleWatch appleWatch = new Iphone1();// default constructor initialized...concrete class used to instantiate
												// abstract class
		appleWatch.abstractClassInfo();
		appleWatch.appleWatchInfo();
		Phone.wireless();
		iphone1.interfaceInfo();
		iphone1.call();
		iphone1.message();
		iphone1.camera();
		iphone1.battery();
		Phone.wireless();

		System.out.println("---phone instantiated------");
		Phone phone = new Iphone1();// concrete class used to instantiate
		phone.interfaceInfo();
		phone.call();
		phone.message();
		phone.camera();
		phone.battery();
		Phone.wireless();

	}

}
