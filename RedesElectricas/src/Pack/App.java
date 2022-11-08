package Pack;

public class App {
	
	public static void main(String[] args) {
		GestorArchivo arch = null;
		int[] ciudadesCenElect = null;

		try {
			arch = new GestorArchivo("ciudades.in");
			GrafoMatrizNoDirigido g = arch.procesarArchivoIn(ciudadesCenElect);
			g.imprimir();
			
			Kruskal kr = new Kruskal();
			System.out.println(kr.recorrerGrafo(g)); 
			
			//System.out.println(ciudadesCenElect[0]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
