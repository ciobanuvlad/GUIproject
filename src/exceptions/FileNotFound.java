package exceptions;
/**
 * 
 * @author Vlad
 * This exception it's throw when the user file "data.txt" doesn't exist anymore. 
 *
 */
@SuppressWarnings("serial")
public class FileNotFound extends Exception{

	
   private static String message="You don't have any file with expenses inside";
	
	/**
	 * The default constructor.
	 */
	
	public FileNotFound(){
		super(message);
	}
}
