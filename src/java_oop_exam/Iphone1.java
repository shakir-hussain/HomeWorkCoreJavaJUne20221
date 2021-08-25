package java_oop_exam;

/*Create a method - regularClassInfo and print out all the features of a regular class compared with Interface and 
 * 
 * Abstract class you know. what is the relation between regular class, Abstract class and Interface? Can you make a
 *  relation of Iphone1 with Phone Interface and AppleWatch Abstract class. [Complete the code after answering above]
 *  . [points: 30] . Think about a class name TestPhone. Instantiate IPhone1, AppleWatch and Phone inside it. Call all the 
 *  possible method by each of them. Go to next step after finishing till this. */
/*Now think about a regular class Iphone1. Create a method - regularClassInfo and print out all the features of a regular class compared with Interface and Abstract class you know. what is the relation between regular class, Abstract class and Interface? Can you make a relation of Iphone1 with Phone Interface and AppleWatch Abstract class. [Complete the code after answering above]. [points: 30] . Think about a class name TestPhone. Instantiate IPhone1, AppleWatch and Phone inside it. Call all the possible method by each of them. Go to next step after finishing till this.*/

/* Assume 4 private variables -- price (as int), Info (as String, write few words when you bought it), user (as a char, M or F), madeInUSA (as boolean) inside Iphone1 class. If the variables are private how can you use those variable? What kind of concept you can use? use it just after the variables. Now print out in TestPhone: "I bought this phone in 2000, the price was 750$, user's sex: <put your sex initial> and boolean value for made in USA is: false".*/
public class Iphone1 extends AppleWatch implements Phone {
	
	
	private int price;
	private String Info;
	private char sex;
	private boolean madeInUSA;
	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return Info;
	}

	public void setInfo(String info) {
		Info = info;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	public void regularClassInfo() {
		System.out.println("we can create an object of a regular class"
				+ "\n\"A regular class only contains implemented methods,we can't declare any methods inside it"
				+ "A regular class inherit only one regular class or one abstract class by extends keyword"
				+ "Implements keyword is used to inherit one or more than one interfaces");
	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub

	}

}
