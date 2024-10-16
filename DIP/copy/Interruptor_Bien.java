package DIP.copy;

public class Interruptor_Bien {
	private Encendible_Bien dispositivo;
	public Interruptor_Bien(Encendible_Bien dispositivo) {
	this.dispositivo = dispositivo;
	}
	public void operar() {
	dispositivo.encender();
	// Más tarde: dispositivo.apagar();
	}
}
