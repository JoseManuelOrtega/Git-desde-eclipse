package ejercicio1;
import java.util.Scanner;

public class main {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);


	        System.out.print("Introduce una frase: ");
	        String frase = scanner.nextLine();


	        String[] p = frase.split(" ");


	        int numeroDePalabras = p.length;

	       
	        String pmax = p[0];
	        String pmin = p[0];

	
	        for (String palabra : p) {
	            if (palabra.length() > pmax.length()) {
	                pmax = palabra;
	            }
	            if (palabra.length() < pmin.length()) {
	                pmin = palabra;
	            }
	        }


	        System.out.println("Numero de palabras: " + numeroDePalabras);
	        System.out.println("Palabra mas larga es " + pmax + " con " + pmax.length() + " caracteres");
	        System.out.println("Palabra mas corta es " + pmin + " con " + pmin.length() + " caracteres");

	        scanner.close();
	    }
	}

