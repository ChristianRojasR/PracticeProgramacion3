package Pack;

public abstract class Grafo {
	
	public abstract int getNodos();
	public abstract void setArista(int desde, int hasta, int costo);
	public abstract int getArista(int desde, int hasta);
	
}
