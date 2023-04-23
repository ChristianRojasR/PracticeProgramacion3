package VII;

public class Producto implements Comparable<Producto>{
	
	private int codigo;
	private String descripcion;
	private double importe;
	private int stock;

	public Producto(int codigo, String descripcion, double importe, int stock) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.importe = importe;
		this.stock = stock;
	}
	public int getCodigo() {
		return codigo;
	}
	
	@Override
	public int compareTo(Producto o) {
		return this.codigo - o.codigo;
	}
	
	@Override
	public String toString() {
		return codigo + ", " + descripcion + ", " + importe + "$, stock "
				+ stock;
	}
	
	public double getImporte() {
		return importe;
	}
	
	public void setImporte(double importe) {
		this.importe = importe;
	}

	
}
