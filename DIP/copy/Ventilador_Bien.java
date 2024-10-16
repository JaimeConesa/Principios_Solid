package DIP.copy;

public class Ventilador_Bien implements Encendible_Bien {
	@Override
	public void encender() {
	System.out.println("El ventilador está encendido");
	}
	@Override
	public void apagar() {
	System.out.println("El ventilador está apagada");
	}
}
