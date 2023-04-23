package Luchadores_japoneses;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyFile {
	
	private String name_file;

	public MyFile(String name_file) {
		this.name_file = name_file;
	}
	
	public Sumo[] read_file() {
		Scanner scanner = null;
		Sumo[] sumos = null;
		
		try {
			File file = new File("casos de prueba/in/" + this.name_file + ".in");
			scanner = new Scanner(file);
			
			int size = scanner.nextInt();		
			sumos = new Sumo[size];		
			for (int i = 0; i < sumos.length; i++) {
				int weight = scanner.nextInt();
				int height = scanner.nextInt();
				sumos[i] = new Sumo(weight, height);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		return sumos;
	}
	
	public void write_file(int[] fights_wins) {
		FileWriter file = null;
		PrintWriter printWriter = null;
		
		try {
			file = new FileWriter("casos de prueba/out/" + this.name_file + ".out");
			printWriter = new PrintWriter(file);
			
			for (int i = 0; i < fights_wins.length; i++) {
				printWriter.println(fights_wins[i]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(file != null) {
				try {
					file.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
