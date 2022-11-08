package Pack;

public class GrafoMatrizNoDirigido extends Grafo {
	private int[][] matrizAdy;

	public GrafoMatrizNoDirigido(int nodos) {
		this.matrizAdy = new int[nodos][nodos];
		ponerEnCero();
	}

	public void agregarArista(int nodoInicio, int nodoFin, int peso) {
		this.matrizAdy[nodoInicio][nodoFin] = peso;
		this.matrizAdy[nodoFin][nodoInicio] = peso;
	}

	private void ponerEnCero() {
		for (int i = 0; i < this.matrizAdy.length; i++) {
			for (int j = 0; j < this.matrizAdy.length; j++) {
				this.matrizAdy[i][j] = 0;
			}
		}
	}

	public void imprimir() {
		for (int i = 0; i < this.matrizAdy.length; i++) {
			for (int j = 0; j < this.matrizAdy.length; j++) {
				System.out.print(this.matrizAdy[i][j] + " ");
			}
			System.out.println("");
		}
	}

	@Override
	public int getNodos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setAristas() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAristas() {
		// TODO Auto-generated method stub
		return 0;
	}
}
