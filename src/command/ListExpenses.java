package command;
import model.Agenda;

public class ListExpenses implements Command{

	private Agenda a;
	
	public void execute(){
		for(int i = 0; i<a.getExpenses().size(); i++)
			System.out.println(a.getExpenses().get(i));
	}

	public Agenda getA() {
		return a;
	}

	public void setA(Agenda a) {
		this.a = a;
	}
	
	
}
