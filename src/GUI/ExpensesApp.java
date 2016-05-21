package GUI;

import java.time.LocalDate;

import command.Forecast;
import command.ListExpenses;
import command.ReadFromFile;
import command.Statistics;
import model.Agenda;
import model.Frequence;

public class ExpensesApp {

	public static void main(String[] args) {

		Agenda agenda = Agenda.getAnAgenda();
		
		ReadFromFile rff = new ReadFromFile();
		rff.setAgenda(agenda);
		rff.execute();
		
		ListExpenses list = new ListExpenses();
		list.setA(agenda);
		System.out.println("******  listare");
		list.execute();
		System.out.println("**** maxim");
		Statistics statistics = new Statistics();
	    statistics.setFrq(Frequence.Weekly);
		statistics.setAgenda(agenda);
		statistics.execute();
		
		Forecast forecast = new Forecast();
		forecast.setAgenda(agenda);
		forecast.setStart(LocalDate.of(2016, 1, 1));
		forecast.setStop(LocalDate.of(2016, 4, 30));
		forecast.execute();
	
		
	}

}
