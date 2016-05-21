/**
 * 
 */
package exceptions;

/**
 * @author Vlad
 *
 */
@SuppressWarnings("serial")
public class NumberFormatException extends Exception {

	
	private static String message="Nmber Format not allowed";
	/**
	 * 
	 */
	public NumberFormatException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public NumberFormatException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public NumberFormatException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public NumberFormatException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public NumberFormatException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	

}
