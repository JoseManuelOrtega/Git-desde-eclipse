package ejercicio3;

public class stock {
 private String nombre;
 private int stock;
 private double precio;

 public stock(String nombre, int stock, double precio) {
     this.nombre = nombre;
     this.stock = stock;
     this.precio = precio;
 }

 public String getNombre() {
     return nombre;
 }

 public void setNombre(String nombre) {
     this.nombre = nombre;
 }

 public int getStock() {
     return stock;
 }

 public void setStock(int stock) {
     this.stock = stock;
 }

 public double getPrecio() {
     return precio;
 }

 public void setPrecio(double precio) {
     this.precio = precio;
 }

 public void mostrarInfo() {
     System.out.println("Producto: " + nombre + ", Stock: " + stock + ", Precio: " + precio);
 }
}
