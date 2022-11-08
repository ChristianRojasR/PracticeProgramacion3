package Pack;

public class AristaKruskal implements Comparable<AristaKruskal>{
	private int desde;
	private int hasta;
	private int peso;

	public AristaKruskal(int desde, int hasta, int peso) {
		this.desde = desde;
		this.hasta = hasta;
		this.peso = peso;
	}

	@Override
	public int compareTo(AristaKruskal o) {
		return this.peso - o.peso;
	}

	@Override
	public String toString() {
		return "(" + desde + ", " + hasta + ", " + peso + ")";
	}

	public int getDesde() {
		return desde;
	}

	public int getHasta() {
		return hasta;
	}

	public int getPeso() {
		return peso;
	}
}
