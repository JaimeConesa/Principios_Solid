package ISP;

public class RobotWorker_Mal implements Worker_Mal {
	@Override
	public void work() {
		System.out.println("Working...");
	}
	@Override
	public void eat() {
		throw new UnsupportedOperationException("Robots don't eat");
	}
}

