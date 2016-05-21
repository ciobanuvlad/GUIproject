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
 * This  class adds the daily expense every day so you dont have to
 */
public class AddDailyExpences implements Command{
    private Agenda a;
    private Expense e;
    private LocalDate finaldate;
	
    /**
     * this method is used for adding the expense
     */
	public void execute() {
	 
            for(LocalDate ld = e.getDate(); ld.isBefore(finaldate); ld= ld.plusDays(1)){
                Expense ex = new Expense(e.getName(), e.getValue(), ld, e.getFrq());
                a.getExpenses().add(ex);
            }
		
	}

	/**
	 * 
	 * @return
	 */
	public Agenda getA() {
		return a;
	}

	/**
	 * 
	 * @param a
	 */
	public void setA(Agenda a) {
		this.a = a;
	}

	/**
	 * 
	 * @return
	 */
	public Expense getE() {
		return e;
	}

	/**
	 * 
	 * @param e
	 */
	public void setE(Expense e) {
		this.e = e;
	}
		
    
}
