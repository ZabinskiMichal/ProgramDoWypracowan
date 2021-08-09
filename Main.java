package pl.zabinski;

public class Main {

    public static void main(String[] args) {
	String napis = "Lubie pizze hawajska";
	napis = napis.replace(" ", "");
	char[] tablica = new char[napis.length()];

	for (int i = 0;i < napis.length(); i++){
	    tablica[i] = napis.charAt(i);
    }

	System.out.println("Dlugosc napisuj wynosci: " + tablica.length);
    }
}
