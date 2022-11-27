package App;

import java.util.LinkedList;
import java.util.List;

public class JugandoConPalabras {
	
	private char[][] tablero;
	
	private List<String> palabras;

	public JugandoConPalabras(char[][] tablero, List<String> palabras) {
		this.tablero = tablero;
		this.palabras = palabras;
	}
	
	@Override
	public String toString() {
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j]);
			}
			System.out.println();
		}
		
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
		return "-----------------";
	}

	public List<String> verificarPalabras(){
		
		List<String> solucion = new LinkedList<String>();
		int posPalabra = 0;
		
		for (String palabra : palabras) {
			char primerLetra = palabra.charAt(0);
			System.out.println(primerLetra);
			
			List<Posicion> listPosicion = new LinkedList<Posicion>();
			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero.length; j++) {
					if(tablero[i][j] == primerLetra) {
						Posicion dato = new Posicion(i, j);
						listPosicion.add(dato);
					}
				}
			}
			
			for (Posicion pos : listPosicion) {
				System.out.println(pos);
			}
			
			posPalabra++;
			for (Posicion pos : listPosicion) {
				
				boolean encontrado = false;
				
				if(palabra.length() <= pos.getFila()+1) {
					int contLetras = 0;
					for (int i = pos.getFila(); i >= palabra.length(); i--) {
						if(tablero[i][pos.getColumna()] == palabra.charAt(palabra.length()-contLetras-1))
							contLetras++;
					}
					if(contLetras == palabra.length()) {						
						solucion.add(posPalabra+" N");
						encontrado = true;
					}
				}
				if(encontrado)
					continue;
				
				if(palabra.length() <= tablero.length - pos.getFila()) {
					int contLetras = 0;
					for (int i = pos.getFila(); i < tablero.length- pos.getFila(); i++) {
						if(tablero[i][pos.getColumna()] == palabra.charAt(contLetras)) 
							contLetras++;
					}
					if(contLetras == palabra.length()) {						
						solucion.add(posPalabra+" S");
						encontrado = true;
					}
				}
				if(encontrado)
					continue;
				
				if(palabra.length() <= pos.getColumna()+1) {
					int contLetras = 0;
					for (int i = pos.getColumna(); i >= palabra.length(); i--) {
						if(tablero[pos.getFila()][i] == palabra.charAt(palabra.length()-contLetras-1)) 
							contLetras++;
					}
					if(contLetras == palabra.length()-1) {						
						solucion.add(posPalabra+" E");
						encontrado = true;
					}
				}
				if(encontrado)
					continue;
				
				if(palabra.length() <= tablero.length - pos.getColumna()) {
					int contLetras = 0;
					for (int i = pos.getColumna(); i < tablero.length - pos.getColumna(); i++) {
						if(tablero[pos.getFila()][i] == palabra.charAt(contLetras)) 
							contLetras++;
					}
					if(contLetras == palabra.length()) {						
						solucion.add(posPalabra+" O");
						encontrado = true;
					}
				}
				if(encontrado)
					continue;
			}
		}
		return solucion;
 	}
}
