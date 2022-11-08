package Pack;

public class UnionFind {

	private int[] id;

	public UnionFind(int tamanio) {
		this.id = new int[tamanio];
		
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
		}
	}
	
	public int find(int p) {
		
		while(id[p] != p)
			p = id[p];
		
		return p;
	}
	
	public boolean union(int p, int q) {
		int i = find(p);
		int j = find(q);
		
		if(i == j) 
			return false;
		
		id[i] = j;
		return true;
	}
	
	public int[] getId() {
		return this.id;
	}
}
