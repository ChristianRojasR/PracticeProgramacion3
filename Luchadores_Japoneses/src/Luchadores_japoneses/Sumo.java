package Luchadores_japoneses;

public class Sumo {
	
	private int weight;
	
	private int height;

	public Sumo(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}
	
	public Sumo() {
		super();
	}

	public int[] combates_ganados(Sumo[] sumos) {
		int[] fights_wins = new int[sumos.length];	
		
		for (int i = 0; i < sumos.length; i++) {
			for (int j = 0; j < sumos.length; j++) {
				if((sumos[i].weight >= sumos[j].weight && sumos[i].height >= sumos[j].height) && i!=j)
					fights_wins[i]++;
			}
		}
		return fights_wins;
	}
	
}
