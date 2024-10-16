// Producto con impuesto
package OCP;

public class ProductoConImpuesto extends Producto {
	private double porcentajeImpuesto;
	public ProductoConImpuesto(String nombre, int precioBase, double porcentajeImpuesto) {
	super(nombre, precioBase);
	this.porcentajeImpuesto = porcentajeImpuesto;
	}
	@Override
	public double calcularPrecio() {
		return getprecioBase() + (getprecioBase() * (porcentajeImpuesto / 100));
	}
}