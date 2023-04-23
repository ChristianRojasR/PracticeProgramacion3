package VII;

public class App_3 {
	public static void main(String[] args) {
		int[] vec = new int[1];
		
		try {
			System.out.println(vec[1]);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
