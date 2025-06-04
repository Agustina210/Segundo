package Practico;
import java.util.Scanner;

public class Controlador {
 public static void main(String[]args) {
	 Scanner lector = new Scanner(System.in);
	 
	 Electronica electronico1 = new Electronica(null, 0, null);
	 
	 System.out.println("Ingresa un producto electronico:"); 
	 electronico1.setNombre(lector.nextLine());
	 
	 System.out.println("Precio: ");
	 electronico1.setPrecio(lector.nextDouble());
	 
	 System.out.println("Marca: ");
	 electronico1.setMarca(lector.next());
	

	
	 Ropa ropa1 = new Ropa(null, 0, null);
	 
	 System.out.println("Ingresa un producto de ropa:"); 
	 ropa1.setNombre(lector.next());
	 
	 System.out.println("Precio: ");
	 ropa1.setPrecio(lector.nextDouble());
	 
	 System.out.println("Talla: ");
	 ropa1.setTalla(lector.next());
	 
	
	 
	 Alimento alimento1 = new Alimento(null, 0, null); 
	 
	 System.out.println("Ingresa un producto alimenticio:"); 
	 alimento1.setNombre(lector.next());
	 
	 System.out.println("Precio: ");
	 alimento1.setPrecio(lector.nextDouble());
	 
	 System.out.println("FechaCaducidad: ");
	 alimento1.setFechaCaducidad(lector.next());
	 	 
	 
	 System.out.println("----PRODUCTOS INGRESADOS----");
	 System.out.println("Electrónica: " + electronico1.getNombre() + " | Marca: " + electronico1.getMarca() + " | Precio: $" + electronico1.getPrecio());
	 System.out.println("Ropa: " + ropa1.getNombre() + " | Talla: " + ropa1.getTalla() + " | Precio: $" + ropa1.getPrecio());
	 System.out.println("Alimento: " + alimento1.getNombre() + " | Fecha caducidad: " + alimento1.getFechaCaducidad() + " | Precio: $" + alimento1.getPrecio());
	 System.out.println("----------------------------------");
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	/* 
	 System.out.println("Marca: ");
	 String marca = lector.nextLine();
	 //Electronica electronico = new Electronica( precioElec, marca);
	 
	 System.out.println("Ingresa un producto de ropa");
	 System.out.println("Nombre ");
	 String nombreRopa = lector.nextLine();
	 System.out.println("Precio: ");
	 double precioRopa = lector.nextDouble();
	 lector.nextLine();
	 System.out.println("Talla: ");
	 String talla = lector.nextLine();
	 Ropa ropa = new Ropa(nombreRopa, precioRopa, talla);
	 
	 System.out.println("Ingresa un producto alimenticio");
	 System.out.println("Nombre: ");
	 String nombreAlim = lector.nextLine();
	 System.out.println("Precio: ");
	 double precioAlim = lector.nextDouble();
	 lector.nextLine();
	 System.out.println("Fecha de caducidad (dd/mm/aaaa): ");
	 String fechaCaducidad = lector.nextLine();
	 Alimento alimento = new Alimento(nombreAlim, precioAlim, fechaCaducidad);
	 
	 System.out.println("---PRODUCTOS INGRESADOS---");
electronico.mostrarInformacion();
ropa.mostrarInformacion();
alimento.mostrarInformacion();
*/
 }
 
 }
 
 
	 
