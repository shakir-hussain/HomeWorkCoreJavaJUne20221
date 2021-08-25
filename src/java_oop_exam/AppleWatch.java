package java_oop_exam;
/* Assume AppleWatch is an abstract class which has 2 method: One is abstractClassInfo [which is a non-abstract
 *  method, print out all the features of an abstract class compared with Interface, regular class]. what type 
 *  of method would be the other one - name appleWatchInfo? Can you create a constructor inside Abstract Class? Create two interface names Watch, DigitalWatch. And a regular class name AppleWatchSeries5. Can you make a relationship with AppleWatch, Watch, DigitalWatch, and AppleWatchSeries5? [points: 70] .
 * */
public abstract class AppleWatch implements Watch, DigitalWatch{

	public void abstractClassInfo() {
		System.out.println(
				"An abstract class cannot be instantiated(cant create an object.only possible when there is a concrete class"
						+ "\nTo declare a abstract method we must write abstract keyword"
						+ "only one regular or abstract class can be inherited by extends keyword"
						+ "we can inherit 1 or more than 1 interfaces only by implements keyword");

	}

	// Abstract method
	public abstract void appleWatchInfo();

	// yes we can create a constructor  (default)
	public AppleWatch() {

	}

}
