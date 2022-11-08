package Pack;

import java.util.PriorityQueue;

/*
 * 
 función Kruskal(G)
   Para cada v en V[G] hacer
     Nuevo conjunto C(v) ← {v}.
   Nuevo heap Q que contiene todas las aristas de G, ordenando por su peso
   Defino un árbol T ← Ø
   // n es el número total de vértices
   Mientras T tenga menos de n-1 aristas y !Q.vacío() hacer
     (u,v) ← Q.sacarMin()
     // previene ciclos en T. agrega (u,v) si u y v están 
     // diferentes componentes en el conjunto.
     // Nótese que C(u) devuelve la componente a la que pertenece u
     Si C(v) ≠ C(u) hacer
       Agregar arista (v,u) a  T
       Merge C(v) y C(u) en el conjunto
   Responder árbol T
 * 
 * */

public class Kruskal {
	
	public int recorrerGrafo(Grafo grafo) {

		// this.actualizarMatriz();
		
		// Ordenamos las aristas de menor a mayor y conservamos la informacion
		PriorityQueue<AristaKruskal> colaDeAristas = new PriorityQueue<AristaKruskal>();
		
		for (int i = 0; i < grafo.length; i++) {
			for (int j = 0; j < grafo[i].length; j++) {
				if(this.grafo[i][j] != Double.MAX_VALUE)
					colaDeAristas.add(new AristaKruskal(i, j, this.grafo[i][j]));		
			}
		}
		
		//Emepzamos a unir los n nodos entre si
		int costo = 0;
		UnionFind unionFind = new UnionFind(grafo.length);
		
		while(!colaDeAristas.isEmpty()) {
			AristaKruskal aristaAux = colaDeAristas.poll();
			System.out.println(aristaAux);
			
			if(unionFind.union(aristaAux.getDesde(), aristaAux.getHasta()))
				costo += aristaAux.getCosto();
		}
		
		// Obtengo el vector de representantes desde unionFind
		representantes = unionFind.getId();
		
	}
	
}
