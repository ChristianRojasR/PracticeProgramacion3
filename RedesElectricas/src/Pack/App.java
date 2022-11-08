package Pack;

public class App {
	
	public static void main(String[] args) {
		GestorArchivo arch = null;
		int[] ciudadesCenElect = null;

		try {
			arch = new GestorArchivo("ciudades.in");
			GrafoMatrizNoDirigido g = arch.procesarArchivoIn(ciudadesCenElect);
			g.imprimir();
			
			System.out.println(ciudadesCenElect[0]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
