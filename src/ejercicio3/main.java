package ejercicio3;

import java.util.Scanner;

public class main {

	    private static stock[] inventario = new stock[100];
	    private static int totalProductos = 0;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	           
	            System.out.println("Menu:");
	            System.out.println("1. Introducir datos nuevo inventario.");
	            System.out.println("2. Nuevo producto.");
	            System.out.println("3. Buscar producto y modificar informacion.");
	            System.out.println("4. Eliminar producto.");
	            System.out.println("5. Mostrar valor total del inventario.");
	            System.out.println("6. Informe rotura de stock.");
	            System.out.println("7. Salir.");
	            System.out.print("Selecciona una opcion: ");
	            int opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    introducirInventario(scanner);
	                    break;

	                case 2:
	                    nuevoProducto(scanner);
	                    break;

	                case 3:
	                    modificarProducto(scanner);
	                    break;

	                case 4:
	                    eliminarProducto(scanner);
	                    break;

	                case 5:
	                    mostrarValorInventario();
	                    break;

	                case 6:
	                    informeRoturaStock();
	                    break;

	                case 7:
	                    System.out.println("Saliendo del programa...");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Opción no válida.");
	            }
	        }
	    }

	    public static void introducirInventario(Scanner scanner) {
	        System.out.print("¿Cuántos productos deseas introducir en el inventario? ");
	        int cantidad = scanner.nextInt();
	        scanner.nextLine();

	        for (int i = 0; i < cantidad && totalProductos < inventario.length; i++) {
	            System.out.print("Introduce el nombre del producto: ");
	            String nombre = scanner.nextLine();

	            System.out.print("Introduce el stock del producto: ");
	            int stock = scanner.nextInt();

	            System.out.print("Introduce el precio del producto: ");
	            double precio = scanner.nextDouble();
	            scanner.nextLine(); 

	            stock producto = new stock(nombre, stock, precio);
	            inventario[totalProductos] = producto;
	            totalProductos++;
	        }
	    }

	    public static void nuevoProducto(Scanner scanner) {
	        if (totalProductos < inventario.length) {
	            System.out.print("Introduce el nombre del producto: ");
	            String nombre = scanner.nextLine();

	            System.out.print("Introduce el stock del producto: ");
	            int stock = scanner.nextInt();

	            System.out.print("Introduce el precio del producto: ");
	            double precio = scanner.nextDouble();
	            scanner.nextLine(); 

	            stock producto = new stock(nombre, stock, precio);
	            inventario[totalProductos] = producto;
	            totalProductos++;
	        } else {
	            System.out.println("No se pueden agregar más productos. El inventario está lleno.");
	        }
	    }

	    public static void modificarProducto(Scanner scanner) {
	        System.out.print("Introduce el nombre del producto a buscar: ");
	        String nombre = scanner.nextLine();

	        stock producto = buscarProducto(nombre);
	        if (producto != null) {
	            System.out.println("Producto encontrado:");
	            producto.mostrarInfo();

	            System.out.print("¿Quieres modificar el stock? (sí/no): ");
	            String respuesta = scanner.nextLine();
	            if (respuesta.equalsIgnoreCase("sí")) {
	                System.out.print("Introduce el nuevo stock: ");
	                int nuevoStock = scanner.nextInt();
	                producto.setStock(nuevoStock);
	            }

	            System.out.print("¿Quieres modificar el precio? (sí/no): ");
	            respuesta = scanner.nextLine();
	            if (respuesta.equalsIgnoreCase("sí")) {
	                System.out.print("Introduce el nuevo precio: ");
	                double nuevoPrecio = scanner.nextDouble();
	                producto.setPrecio(nuevoPrecio);
	            }
	        } else {
	            System.out.println("Producto no encontrado.");
	        }
	    }

	    public static void eliminarProducto(Scanner scanner) {
	        System.out.print("Introduce el nombre del producto a eliminar: ");
	        String nombre = scanner.nextLine();

	       
	        stock producto = buscarProducto(nombre);
	        if (producto != null) {
	            for (int i = 0; i < totalProductos; i++) {
	                if (inventario[i].getNombre().equalsIgnoreCase(nombre)) {
	                    for (int j = i; j < totalProductos - 1; j++) {
	                        inventario[j] = inventario[j + 1];
	                    }
	                    inventario[totalProductos - 1] = null;
	                    totalProductos--;
	                    System.out.println("Producto eliminado.");
	                    return;
	                }
	            }
	        } else {
	            System.out.println("Producto no encontrado.");
	        }
	    }

	    public static void mostrarValorInventario() {
	        double valorTotal = 0;
	        for (int i = 0; i < totalProductos; i++) {
	            valorTotal += inventario[i].getStock() * inventario[i].getPrecio();
	        }
	        System.out.println("Valor total del inventario: " + valorTotal);
	    }

	    public static void informeRoturaStock() {
	        System.out.println("Informe de rotura de stock (productos con stock inferior a 50):");
	        for (int i = 0; i < totalProductos; i++) {
	            if (inventario[i].getStock() < 50) {
	                inventario[i].mostrarInfo();
	            }
	        }
	    }

	    public static stock buscarProducto(String nombre) {
	        for (int i = 0; i < totalProductos; i++) {
	            if (inventario[i].getNombre().equalsIgnoreCase(nombre)) {
	                return inventario[i];
	            }
	        }
	        return null;
	    }
	}

	
