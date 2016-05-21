package command;



import java.time.LocalDate;

import javax.swing.JButton;

import model.Agenda;
import model.Expense;

@SuppressWarnings("unused")
public class AddExpenses extends JButton implements Command {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Agenda a;
	private Expense e;
	// this method adds the expense to the obj called Agenda where we have all  the expenses
	public void execute() {
		
		a.getExpenses().add(e);
		
	}

	public Agenda getA() {
		return a;
	}

	public void setA(Agenda a) {
		this.a = a;
	}

	public Expense getE() {
		return e;
	}

	public void setE(Expense e) {
		this.e = e;
	}
		
}
