package command;



import java.time.LocalDate;

import javax.swing.JButton;

import model.Agenda;

public class Forecast extends JButton implements Command{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Agenda agenda;
	private LocalDate start;
	private LocalDate stop;
	private float forecast;
	
	
	// this method summs all the expenses
	public void execute(){
		float sum = 0;
		for(int i =0; i<agenda.getExpenses().size(); i++){
			if(start.compareTo(agenda.getExpenses().get(i).getDate()) <= 0 && stop.compareTo(agenda.getExpenses().get(i).getDate()) >= 0)
			sum = sum + agenda.getExpenses().get(i).getValue();
			
		}
		this.forecast=(float)(sum*1.05);
		System.out.println(this.forecast);
		
	}



	public Agenda getAgenda() {
		return agenda;
	}



	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}



	public LocalDate getStart() {
		return start;
	}



	public void setStart(LocalDate start) {
		this.start = start;
	}



	public LocalDate getStop() {
		return stop;
	}



	public void setStop(LocalDate stop) {
		this.stop = stop;
	}



	public float getForecast() {
		return forecast;
	}
	
	
	
	
}
