package ejercicio2;

import java.util.Scanner;

public class main {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int opt;
		do {
		System.out.println("¿Que desea hacer?");
		System.out.println("1. Mostrar número de entradas libres");
		System.out.println("2. Vender entradas");
		System.out.println("3. Salir");
		opt = sc.nextInt();
		switch(opt) {
		case 1 -> mostrar();
		case 2 -> vender();
		case 3 -> System.out.println("Saliendo...");
		default -> System.out.println("Dato incorrecto");
		}
		}
		while(opt !=3);
		
		

	}
	private static void mostrar(){
		System.out.println("Total " + entradas.getEntradasTotales());		
		System.out.println("Principal " + entradas.getEntradaZonaPrincipal());
		System.out.println("Platea " + entradas.getEntradaZonaPlatea());
		System.out.println("Vip " + entradas.getEntradaZonaVip());


	}
	private static void vender() {
		System.out.println("¿Que entrada quiere vender?");
		System.out.println("principal");
		System.out.println("zona platea");
		System.out.println("zona vip");
		String zona = sc.nextLine();
		if(zona.equalsIgnoreCase(zona = "principal")) {
			System.out.println("Introduzca cuantas entradas desea vender");
			int vender = sc.nextInt();
			int total = entradas.getEntradasTotales();
			int principal = entradas.getEntradaZonaPrincipal();
			int totalActual = total-vender;
			int principalActual = principal - vender;
			System.out.println("Se han vendido " + vender + " correctamente");
		}
	}
}
