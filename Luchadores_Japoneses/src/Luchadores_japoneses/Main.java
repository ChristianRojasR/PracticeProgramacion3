package Luchadores_japoneses;

public class Main {
	public static void main(String[] args) {
		MyFile file = new MyFile("00");
		Sumo result = new Sumo();
		
		file.write_file(result.combates_ganados(file.read_file()));
	}
}
