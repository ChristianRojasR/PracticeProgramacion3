package App;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class GestorDeArchivos {
	
	private String nombreArch;

	public GestorDeArchivos(String nombreArch) {
		this.nombreArch = nombreArch;
	}

	public JugandoConPalabras abrirArchivo(){
		
		Scanner scanner = null;
		JugandoConPalabras datos = null;
		
		try {
			File file = new File("pruebas/" + this.nombreArch + ".in");
			scanner = new Scanner(file);
			
			scanner.useLocale(Locale.ENGLISH);
			
			int dimMat = scanner.nextInt();
			int cantPal = scanner.nextInt();
			
			char[][] tablero = new char[dimMat][dimMat];
			for (int i = 0; i < tablero.length; i++) {
				String line = scanner.next();
				for (int j = 0; j < line.length(); j++) {
					tablero[i][j] = line.charAt(j);
				}
			}
			
			List<String> palabras = new LinkedList<String>();
			for (int i = 0; i < cantPal; i++) {
				palabras.add(scanner.next());
			}
			
			datos = new JugandoConPalabras(tablero, palabras);
		
		} catch (Exception e){
			e.printStackTrace();
			
		} finally {
			scanner.close();
		}
		
		return datos;
	}
}
