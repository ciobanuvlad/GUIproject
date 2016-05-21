package command;

import java.util.logging.Logger;

import javax.swing.JButton;

import model.Agenda;
import model.Frequence;

public class Statistics extends JButton implements Command {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Agenda agenda;
	private Frequence Frq;
	private int max;
	private int pozMax;
	private int an;
	
	public static final Logger LOGGER = Logger.getGlobal();
    
	/**
	 * 
	 */
	public void execute() {
		int maxExp = agenda.getExpenses().get(0).getValue();
		int pozitieMax = 0;
		for (int i = 1; i < agenda.getExpenses().size(); i++) {
			if (Frq == agenda.getExpenses().get(i).getFrq()&& an==agenda.getExpenses().get(i).getDate().getYear()) {
				if (maxExp < agenda.getExpenses().get(i).getValue()) {
					maxExp = agenda.getExpenses().get(i).getValue();
					pozitieMax = i;
				}
			}

		}
		max=agenda.getExpenses().get(pozitieMax).getValue();
		pozMax=pozitieMax;
		System.out.println();
	}

	/**
	 * 
	 * @return
	 */
	public Frequence getFrq() {
		return Frq;
	}
    /**
     * 
     * @param frq
     */
	public void setFrq(Frequence frq) {
		Frq = frq;
	}
    /**
     * 
     * @return
     */
	public Agenda getAgenda() {
		return agenda;
	}
	
    /**
     * 
     * @param agenda
     */
	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	/**
	 * 
	 * @return
	 */
	public int getMax() {
		return max;
	}

	/**
	 * 
	 * @return
	 */
	public int getPozMax() {
		return pozMax;
	}

	/**
	 * 
	 * @param an
	 */
	public void setAn(int an) {
		this.an = an;
	}
	
	
}
