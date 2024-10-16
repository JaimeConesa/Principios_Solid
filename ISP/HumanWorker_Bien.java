package ISP;

public class HumanWorker_Bien implements Workable_Bien, Eatable_Bien {
	@Override
	public void work() {
	System.out.println("Working...");
	}
	@Override
	public void eat() {
	System.out.println("Eating...");
	}
}
