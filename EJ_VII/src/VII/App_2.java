package VII;

public class App_2 {
	public static void main(String[] args) {
		int[][] prueba = null;
		
		try {
			prueba.clone();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
