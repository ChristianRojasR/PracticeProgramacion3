package App;

import java.util.List;

public class App {
	public static void main(String[] args) {
		
		GestorDeArchivos gestor = new GestorDeArchivos("00");
		
		JugandoConPalabras datos = gestor.abrirArchivo();
		
		System.out.println(datos);
		
		List<String> list = datos.verificarPalabras();
		
		System.out.println();
		for (String string : list) {
			System.out.println(string);
			System.out.println("1");
		}
	}
}
