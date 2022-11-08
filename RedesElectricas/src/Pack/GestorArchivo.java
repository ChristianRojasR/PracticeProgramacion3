package Pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GestorArchivo {
	private String nombre;

	public GestorArchivo(String nombre) {
		this.nombre = nombre;
	}

	@SuppressWarnings("finally")
	public GrafoMatrizNoDirigido procesarArchivoIn(int [] ciudadesCenElect) throws FileNotFoundException {
		Scanner archivo = null;
		GrafoMatrizNoDirigido f = null;

		try {
			archivo = new Scanner(new File(this.nombre));
			int nodos = archivo.nextInt();

			f = new GrafoMatrizNoDirigido(nodos);

			int cantCiudadesCenElect = archivo.nextInt();
			//int[] ciudadesCenElect = new int[cantCiudadesCenElect];
			ciudadesCenElect = new int[cantCiudadesCenElect];

			for (int i = 0; i < ciudadesCenElect.length; i++) {
				ciudadesCenElect[i] = archivo.nextInt();
				System.out.println(ciudadesCenElect[i]);
			}

			int col = 0, fila = 0;
			while (archivo.hasNext()) {
				int valor = archivo.nextInt();
				f.agregarArista(fila, col, valor);
				col++;
				if (col >= nodos) {
					col = 0;
					fila++;
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (archivo != null) {
				archivo.close();
			}
			return f;
		}
	}
}