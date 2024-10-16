package DIP.copy;

public class Bombilla_Bien implements Encendible_Bien {
	@Override
	public void encender() {
	System.out.println("La bombilla está encendida");
	}
	@Override
	public void apagar() {
	System.out.println("La bombilla está apagada");
	}
}
