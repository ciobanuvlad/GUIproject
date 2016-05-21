package command;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Logger;

import model.Agenda;
import model.Expense;
import model.Frequence;

public class ReadFromFile implements Command {
//this class reads the date from the destination file
	public Agenda agenda;
	public final String fileName = "dataFile.txt";
	
	public static final Logger LOGGER = Logger.getGlobal();

	@SuppressWarnings("resource")
	public void execute() {
		try {
			File fr = new File(fileName);
			Scanner sc = new Scanner(fr);

			while (sc.hasNextLine()) {

				String str = sc.nextLine();
				System.out.println(str);
				int poz2p = str.indexOf(':');
				int poz2p2 = str.indexOf(':', poz2p + 1);
				int poz2p3 = str.indexOf(':', poz2p2 + 1);
				String nume = str.substring(0, poz2p);
				String pret = str.substring(poz2p + 1, poz2p2);
				String data = str.substring(poz2p2 + 1, poz2p3);
				String type = str.substring(poz2p3 + 1);
				int price = Integer.parseInt(pret);

				Frequence tip = Frequence.Daily;
				if (type.equals("Daily"))
					tip = Frequence.Daily;
				if (type.equals("Weekly"))
					tip = Frequence.Weekly;
				if (type.equals("Monthly"))
					tip = Frequence.Monthly;
				if (type.equals("Yearly"))
					tip = Frequence.Yearly;

				int prl = data.indexOf('-');
				int adl = data.indexOf('-', prl + 1);
				String an = data.substring(0, prl);
				String l = data.substring(prl + 1, adl);
				String z = data.substring(adl + 1, data.length());
				int zz = Integer.parseInt(z);
				int ll = Integer.parseInt(l);
				int aaaa = Integer.parseInt(an);

				Expense expenses = new Expense(nume, price, LocalDate.of(aaaa, ll, zz), tip);
				agenda.getExpenses().add(expenses);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (@SuppressWarnings("hiding") IOException e) {
			e.printStackTrace();
		}

	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public String getFileName() {
		return fileName;
	}
	
	
}
