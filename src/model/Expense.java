package model;

/**
 * @author  Vlad 
 * For each expense we have an expense object. 
 * The base clased of this application. 
 */
import java.time.LocalDate;
import java.util.logging.Logger;

public class Expense{

	/**
	 * The name of good or service.
	 */
	private String name;
	/**
	 * The price for that good.
	 */
	private int value;
	/**
	 * The date when we buy that good or service.
	 */
	private LocalDate date;
	/**
	 * Frequency we used to buy that good or service. 
	 */
	private Frequence frq;
	
	public static final Logger LOGGER = Logger.getGlobal();

	
	/**
	 * Explicit constructor.
	 * @param name the name of good or service which we use to pay for it.
	 * @param value the price of that good or service.
	 * @param date the date when we pay for it.
	 * @param frq the frequency to pay for it. 
	 */
	public Expense(String name, int value, LocalDate date, Frequence frq) {
		LOGGER.fine("We build a new Expense object ("+name+','+value+','+date+','+frq+'.');
		this.name = name;
		this.value = value;
		this.date = date;
		this.frq = frq;
	}
	/**
	 * GETTER 
	 * @return the name of good or service. 
	 */
	public String getName() {
		LOGGER.fine("We get the name of Expense");
		return name;
	}
	/**
	 * SETTER
	 * @param name the new name for that good or service.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * GETTER
	 * @return the amount used to pay for that good or service.
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * SETTER
	 * @param value the new amount used to pay for that good or service. 
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * GETTER
	 * @return the date when we pay for that expense. 
	 */
	public LocalDate getDate() {
		return date;
	}
	
	/**
	 * SETTER
	 * @param date the new date used to describe that expense. 
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	/**
	 * GETTER
	 * @return the frequence to pay for that good or service. 
	 */
	public Frequence getFrq() {
		return frq;
	}
	/**
	 * SETTER
	 * @param frq the new frequence which we use for the expense.
	 */
	public void setFrq(Frequence frq) {
		this.frq = frq;
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		LOGGER.fine("We print the Expense object: "+name + ":" + value + ":" + date + ":" + frq);
		return name + ":" + value + ":" + date + ":" + frq;
	}
	
	/**
	 * @see java.lang.Object#equals()
	 */
	public boolean equals(Object obj) {
		LOGGER.fine("We compare two Expense objects!");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expense other = (Expense) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (frq != other.frq)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (value != other.value)
			return false;
		return true;
	}
	
	
	
	
}
