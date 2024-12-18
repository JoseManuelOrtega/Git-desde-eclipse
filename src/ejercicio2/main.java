package ejercicio2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

      
        Zona zonaPrincipal = new Zona("Principal", 1000);
        Zona zonaPlatea = new Zona("Platea", 200);
        Zona zonaVip = new Zona("VIP", 25);

        while (true) {
          
            System.out.println("Menu:");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();

            
            switch (opcion) {
                case 1:
                    
                    zonaPrincipal.mostrarEntradas();
                    zonaPlatea.mostrarEntradas();
                    zonaVip.mostrarEntradas();
                    break;

                case 2:
                    
                    System.out.print("Selecciona la zona (principal, platea, vip) ");
                    scanner.nextLine();  
                    String zona = scanner.nextLine().toLowerCase();

                    System.out.print("¿Cuantas entradas deseas vender? ");
                    int cantidad = scanner.nextInt();

                    
                    switch (zona) {
                        case "principal":
                            zonaPrincipal.venderEntradas(cantidad);
                            break;
                        case "platea":
                            zonaPlatea.venderEntradas(cantidad);
                            break;
                        case "vip":
                            zonaVip.venderEntradas(cantidad);
                            break;
                        default:
                            System.out.println("Zona no valida.");
                    }
                    break;

                case 3:
                  
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opcion no válida.");
            }
        }
    }
}