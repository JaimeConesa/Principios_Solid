package LSP;

public class Gorrion_Bien extends Ave_Bien implements Volador {
	public Gorrion_Bien(String nombre) {
		super(nombre);
}
	@Override
	public void volar() {
		System.out.println("El gorrión está volando");
	}
}
