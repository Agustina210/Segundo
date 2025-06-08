package PracticoIII;

import java.util.Scanner;

public class Controlador {
		 public static void main(String[]args) {
			 Scanner lector = new Scanner(System.in);
			 
         Casa casa1 = new Casa(null, 0, 0);
			 
			
             System.out.println("Ingresa la direccion de la casa: ");
			 casa1.setDireccion(lector.nextLine());
			 
             System.out.println("El numero de habitaciones:");
			 casa1.setNumHabitaciones(lector.nextInt());
			 
			 System.out.println("Numero de pisos: ");
			 casa1.setNumPisos(lector.nextInt());
			 
		Apartamento apartamento1 = new Apartamento(null, 0, 0, 0);
			 
			 System.out.println("Ingresa la direccion del apartamento:"); 
			 apartamento1.setDireccion(lector.next());
			 
			 System.out.println("Numero de piso: ");
			 apartamento1.setPiso(lector.nextInt());
			 
			 System.out.println("Cantidad de pisos: ");
			 apartamento1.setNumPisos(lector.nextInt());
			 
			 System.out.println("Numero baños: ");
			 apartamento1.setNumBaños(lector.nextInt());
			

		 System.out.println("----DATOS INGRESADOS----");
		 System.out.println("Direccion casa: " + casa1.getDireccion() + " | N habitaciones: " + casa1.getNumHabitaciones() + " | N de pisos: " + casa1.getNumPisos());
		 System.out.println("Direccion apartamento: " + apartamento1.getDireccion() + " | N de piso: " + apartamento1.getPiso() + " | N de pisos: " + apartamento1.getNumPisos() + " | N de baños: " + apartamento1.getNumBaños());
   } 		
}
