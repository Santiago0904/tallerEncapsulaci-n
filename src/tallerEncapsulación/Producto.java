package tallerEncapsulación;

public class Producto {

	private String nombre;
	private double precio;
	private double cantidadStock;
	
	public Producto(String nombre, double precio, double cantidadStock) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadStock = cantidadStock;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombres(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}else {
			System.out.println("El precio ingresado debe ser positivo");
		}
	}
	public double getCantidadStock() {
		return cantidadStock;
	}
	public void setCantidadStock(double cantidadStock) {
		if (cantidadStock > 0) {
			this.cantidadStock = cantidadStock;
		}else {
			System.out.println("El stock ingresado debe ser positivo");
		}
	}
	public void mostrarProducto() {
		System.out.println("Nombre del producto: "+nombre);
		System.out.println("Precio: $"+precio);
		System.out.println("Cantidad en stock: "+cantidadStock);
	}
	
}
