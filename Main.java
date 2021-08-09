package pl.zabinski;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File file = new File("plik.txt");

		String napis = "";
		try {
			file.createNewFile();
			Scanner fileScanner = new Scanner(file);
			while (fileScanner.hasNext()) {
				napis = napis + fileScanner.nextLine();
			}
			napis = napis.replace(" ", "");
			char[] tablica = new char[napis.length()];
			for (int i = 0; i < napis.length(); i++) {
				tablica[i] = napis.charAt(i);
			}
			System.out.println(napis);
			System.out.println("Dlugosc napisuj wynosci: " + tablica.length);


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}
}
