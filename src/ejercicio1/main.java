package ejercicio1;

import java.util.Scanner;

public class main {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int salir=0;
		int frasemax =0;
		int frasemin =0;
		do {
		for(int i=salir; i<2; i++) {
		System.out.println("Introduzca una frase");
		String frase = sc.nextLine();
		System.out.println("La frase contiene " + frase.length());
		System.out.println("¿Quiere continuar?");
		System.out.println("1.Si");
		System.out.println("2.No");
		salir = sc.nextInt();
		}}
		while(salir !=2);
		
		}}
