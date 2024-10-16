// Producto con descuento
	package OCP;
	
	public class ProductoConDescuento extends Producto {
	private double porcentajeDescuento;
	public ProductoConDescuento(String nombre, int precioBase, double porcentajeDescuento) {
		super(nombre, precioBase);
		this.porcentajeDescuento = porcentajeDescuento;
	}
	@Override
	public double calcularPrecio() {
	return getprecioBase() - (getprecioBase() * (porcentajeDescuento / 100));
	}
}