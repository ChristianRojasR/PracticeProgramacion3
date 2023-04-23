package VII;

class MyException extends Exception {
	public MyException (String mensaje) {
		super(mensaje);
	}
}

public class App {

	public static void main(String[] args) {
		try {
			throw new MyException("Mi Exception fue lanzada");
			
		} catch(MyException e) {
			e.printStackTrace();
			
		} finally {
			System.out.println("-----------");
		}
	}
}
