package exceptions;

/**
 * 
 * @author Vlad 
 * This class it is used for reference to that situations when the user introduce an expense after or before the agenda time interval.
 *
 */

public class ExpenseNotAllowedByDateException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static String message="The expense it is not allowed because the date is befrore/after the agenda time interval";
	
	/**
	 * The default constructor.
	 */
	
	public ExpenseNotAllowedByDateException(){
		super(message);
	}

}
