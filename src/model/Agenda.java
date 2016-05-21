package model;

/**
 * @author Vlad
* Class agenda it is a "singleton" class. 
* It contains all the expences. 
*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Agenda{
    //this class contains the container where is stored all the expenses
    
    /**
     * The container where are stored all the expenses. 
     */
	private ArrayList<Expense> expenses = new ArrayList<Expense>();
    /**
     * The date after we can introduce expenses in the agenda. 
     */
	private LocalDate startDate;
	/**
	 * The date before we cand inroduce expenses in the agenda.
	 */
	private LocalDate stopDate;
	/**
	 * A name reference for the expenses agenda, such as "Popescu Family Expenses". 
	 */
	private String name;
	/**
	 * A static field used to allow the existence of only one object
	 */
	private static Agenda agenda = null;
	public static final Logger LOGGER = Logger.getGlobal();

	/**
	 * Private and default constructor. 
	 */
	private Agenda() {
		LOGGER.info("The single use of the Agenda constructor! ");
		this.startDate = LocalDate.of(2016, 1, 1);
		this.stopDate = LocalDate.of(2016, 12, 31);
	}

	/**
	 * Class method used to give acces to use the Agenda. 
	 * ! Agenda is a singleton class.
	 * @return an Agenda.
	 */
	public static Agenda getAnAgenda() {
		LOGGER.fine("We try to obtain acces to Agenda class using the static class.");
		if (agenda == null) {
			LOGGER.info("No other Agenda exists!");
			agenda = new Agenda();
			return agenda;
		} else {
			LOGGER.info("We share the same Agenda object");
			return agenda;
		}

	}

	/**
	 * 
	 * @return the date after we can introduce expenses in our agenda. 
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * SETTER 
	 * @param startDate the new date after we can introduce expenses in our agenda.
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	
	/**
	 * 
	 * @return the date before we can introduce expenses in our Agenda. 
	 */
	public LocalDate getStopDate() {
		return stopDate;
	}

	/**
	 * SETTER 
	 * @param startDate the new date after we can introduce expenses in our agenda.
	 */
	public void setStopDate(LocalDate stopDate) {
		this.stopDate = stopDate;
	}

	/**
	 * 
	 * @return a reference to the expenses container 
	 */
	public ArrayList<Expense> getExpenses() {
		return expenses;
	}

	/**
	 * The function indicates a new expenses container which we can use. 
	 * @param expenses  reference to a new expenses container. 
	 */
	public void setExpenses(ArrayList<Expense> expenses) {
		this.expenses = expenses;
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
    /**
     * 
     * @param name
     */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
