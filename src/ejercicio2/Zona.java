package ejercicio2;

public class Zona {
	  private String nombre;
	    private int entradasDisponibles;

	    public Zona(String nombre, int entradasDisponibles) {
	        this.nombre = nombre;
	        this.entradasDisponibles = entradasDisponibles;
	    }

	    public void mostrarEntradas() {
	        System.out.println("Zona " + nombre + ": " + entradasDisponibles + " entradas disponibles.");
	    }

	    public boolean venderEntradas(int cantidad) {
	        if (cantidad <= entradasDisponibles) {
	            entradasDisponibles -= cantidad;
	            System.out.println("Venta realizada. Quedan " + entradasDisponibles + " entradas en la zona " + nombre);
	            return true;
	        } else {
	            System.out.println("No hay suficientes entradas disponibles en la zona " + nombre);
	            return false;
	        }
	    }
	}