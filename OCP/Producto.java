package OCP;

public class Producto {
	private String nombre;
	private int precioBase;
	
	public Producto(String nombre, int precioBase) {
		this.nombre=nombre;
		this.precioBase=precioBase;
	}
	public double calcularPrecio() {
		return precioBase;
	}
	public String getNombre() {
		return nombre;
	}
	public int getprecioBase() {
		return precioBase;
	}
}
