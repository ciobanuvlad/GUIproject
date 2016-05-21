package command;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.time.LocalDate;

import model.Agenda;
import model.Expense;

/**
 *
 * @author Vlad
 * This class is similar to AddDailyExpense but this adds the monthly expenses
 */
public class AddMonthlyExpenses {
    private Agenda a;
    private Expense e;
    private LocalDate finaldate;
	
	public void execute() {
		// this method adds a monthly expense every month
            for(LocalDate ld = e.getDate(); ld.isBefore(finaldate); ld= ld.plusMonths(1)){
                Expense ex = new Expense(e.getName(), e.getValue(), ld, e.getFrq());
                a.getExpenses().add(ex);
		
            }
		
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
