package tallerEncapsulación;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Producto> listaProductos = new ArrayList<>();
		
		listaProductos.add(new Producto("Chociltos", 2000.0, 50));
		listaProductos.add(new Producto("Doritos", 2500.0, 40));
		listaProductos.add(new Producto("Bombón", 500.0, 60));
		listaProductos.add(new Producto("Trident", 400.0, 25));
		listaProductos.add(new Producto("Jabón", 3500.0, 75));
		listaProductos.add(new Producto("Tijeras", 2500.0, 15));

		
		for(Producto emp: listaProductos) {
			emp.mostrarProducto();
			System.out.println("-----------------------");
		}
		
		listaProductos.get(1).setCantidadStock(50);
		
		listaProductos.remove(2);
		
		System.out.println("\nProductos Actualizados\n--------------------");
		
		for(Producto emp: listaProductos) {
			emp.mostrarProducto();
			System.out.println("--------------------");
		}
		
		String busquedaProducto = JOptionPane.showInputDialog("Ingresa el nombre del producto que quiere encontrar: ");
		
		boolean productoEncontrado= false;
		
		for(Producto nombreProducto : listaProductos) {
			if(nombreProducto.getNombre().equals(busquedaProducto)) {
				System.out.println("\nEl producto buscado ha sido encontrado con éxito\n");
				nombreProducto.mostrarProducto();
				productoEncontrado = true;
				break;
			}
		}
			
		
		if(!productoEncontrado) {
			System.out.println("El producto buscado no existe");
		}
		}
	}

