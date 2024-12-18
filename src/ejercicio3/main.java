package ejercicio3;

import java.util.Scanner;

public class main {
	private static int maxStock = 100;
	private static int contador = 0;
	private static stock[] stock = new stock[maxStock];
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int opt;
		
		do {
			System.out.println("¿Que desea hacer?");
			System.out.println("1. Introducir datos nuevo inventario");
			System.out.println("2. Nuevo producto");
			System.out.println("3. Buscar producto y modificar información");
			System.out.println("4. Eliminar producto");
			System.out.println("5. Mostrar valor total del inventario");
			System.out.println("6. Informe rotura de stock");
			System.out.println("7. Salir");
			opt = sc.nextInt();
			switch(opt) {
			case 1 -> introducirDatos();
			case 2 -> nuevoProducto();
			case 3 -> buscar();
			case 4 -> eliminar();
			case 5 -> total();
			case 6 -> informe();
			case 7 -> System.out.println("Saliendo...");
			default -> System.out.println("Dato incorrecto");
			}
		}while(opt !=7);
		

}
	private static void introducirDatos() {
	for(int i = 0; i< stock.length; i++) {
		System.out.println("Introduzca el nombre del producto");
		String nombre = sc.nextLine();
		System.out.println("Introduzca la cantidad del producto");
		int cantidad = sc.nextInt();
		System.out.println("Introduzca su precio");
		int precio = sc.nextInt();
		stock[contador] = nombre;
		contador++;
	}
}
	private static void buscar() {
		for(int i = 0; i< stock.length; i++) {
			System.out.println("Introduzca el nombre del producto que desea comprar");
			String producto = sc.nextLine();
			if(stock[i].equals(producto)) {
				System.out.println(stock[i]);
			}
			else {
				System.out.println("Dato no encontrado");
			}
		}
	}
	private static void eliminar(){
		for(int i = 0; i< stock.length; i++) {
			System.out.println("Introduzca el nombre del producto que desea comprar");
			String producto = sc.nextLine();
			if(stock[i].equals(producto)) {
			for(int j = i; j< stock.length; j--) {
				contador--;
				stock[i++] = null;
				}}
			else {
				System.out.println("No existe");
			}
			
		}
	}
	
}
	
