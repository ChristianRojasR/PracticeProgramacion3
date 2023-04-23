package VII;

import java.util.LinkedList;
import java.util.List;

public class App_4 {
	public static void main(String[] args) {
		
		List<Producto> lista = new LinkedList<Producto>();
		for (int i = 1; i < 5; i++) {
			Producto prod = new Producto(i, "Producto_" + i, i, i);
			lista.add(prod);
		}
		
		System.out.println("Imprimir\n------------");
		for (Producto producto : lista) {
			System.out.println(producto);
			System.out.println("------------");
		}
		
		System.out.println("Imprimir k-enesimos\n------------");
		for (int i = 1; i < 3; i++) {
			System.out.println(lista.get(i));
			System.out.println("------------");
		}
		
		System.out.println("Cambiar costo a un prodructo\n------------");
		int codAux = 3;
		for (Producto producto : lista) {
			if(producto.getCodigo() == codAux) {
				producto.setImporte(producto.getImporte() + producto.getImporte()*0.1);
				System.out.println(producto);
			}
		}
	}
}
