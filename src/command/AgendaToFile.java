package command;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import model.Agenda;

public class AgendaToFile implements Command{
//this class writes data to specified file whith the execute() method
	
	public Agenda agenda;
	public String fileName="dataFile.txt";
	
	public void execute(){
		try {
			PrintWriter pw = new PrintWriter(fileName, "UTF-8");
			for(int i= 0; i<agenda.getExpenses().size();i++){
				pw.println(agenda.getExpenses().get(i));
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
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

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
