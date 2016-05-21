/**
 * This class it is used for prices which are negative. 
 */
package exceptions;

/**
 * @author Vlad 
 *
 */
@SuppressWarnings("serial")
public class NegativeNumberException extends Exception{
	
	private static String message="Your Price it is negative";

	public NegativeNumberException() {
		super(message);
	}

	public String getMessage() {
		return message;
	}
	
	

}
