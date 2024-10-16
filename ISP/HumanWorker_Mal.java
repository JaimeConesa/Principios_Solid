package ISP;

public class HumanWorker_Mal implements Worker_Mal {
	@Override
	public void work() {
	System.out.println("Working...");
	}
	@Override
	public void eat() {
	System.out.println("Eating...");
	}
}
