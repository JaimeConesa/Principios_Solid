package DIP.copy;

public class Interruptor_Mal {
	private Bombilla_Mal bombilla;
	public Interruptor_Mal(Bombilla_Mal bombilla) {
	this.bombilla = bombilla;
	}
	public void operar() {
	bombilla.encender();
	// Más tarde: bombilla.apagar();
	}
}
