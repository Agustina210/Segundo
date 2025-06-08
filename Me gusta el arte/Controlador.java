package PracticoIV;
import java.util.Scanner;
public class Controlador {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		 Pintura pintura1 = new Pintura(null, null, 0, null, null, null);
		 
		System.out.println("Ingresa el titulo de la pintura:");
		 pintura1.setTitulo(lector.next());
		 
		 System.out.println("El autor:");
		 pintura1.setAutor(lector.next());
		 
		 System.out.println("El valor:");
		 pintura1.setValor(lector.nextInt());
		 
         System.out.println("El tipo de pintura: ");
		 pintura1.setTipoPintura(lector.next());
		 
         System.out.println("Las dimensiones:");
		 pintura1.setDimensiones(lector.next());
		 
		 System.out.println("El estilo: ");
		 pintura1.setEstilo(lector.next());
		 
		 Escultura escultura1 = new Escultura(null, null, 0, null, 0.0, 0.0);
		 
		System.out.println("Ingresa el titulo de la escultura:");
		escultura1.setTitulo(lector.next());
		 
		 System.out.println("El autor:");
		 escultura1.setAutor(lector.next());
			 
		 System.out.println("El valor:");
		 escultura1.setValor(lector.nextInt());
		 
		 System.out.println("Ingresa el material:"); 
		 escultura1.setMaterial(lector.next());
		 
		 System.out.println("El peso: ");
		 escultura1.setPeso(lector.nextDouble());
		 
		 System.out.println("La altura: ");
		 escultura1.setAltura(lector.nextDouble());
		 
		 Fotografia fotografia1 = new Fotografia(null, null, 0, null, 0.0, null );
		 
		 System.out.println("Ingresa el titulo de la fotografia:");
		 fotografia1.setTitulo(lector.next());
			 
		 System.out.println("El autor:");
		 fotografia1.setAutor(lector.next());
				 
		 System.out.println("El valor:");
		 fotografia1.setValor(lector.nextInt());
			
         System.out.println("Ingresa el tipo de camara: ");
         fotografia1.setTipoCamara(lector.next());
		 
         System.out.println("Las resolucion:");
         fotografia1.setResolucion(lector.nextDouble());
		 
		 System.out.println("El formato: ");
		 fotografia1.setFormato(lector.next());
		

	 System.out.println("----DATOS INGRESADOS----");
	 System.out.println("Pintura:");
	 System.out.println("Titulo: " + pintura1.getTitulo());
	 System.out.println("Autor: " + pintura1.getAutor());
	 System.out.println("Valor: $" + pintura1.getValor());
	 System.out.println("Tipo de pintura: " + pintura1.getTipoPintura());
	 System.out.println("Dimensiones: " + pintura1.getDimensiones());
	 System.out.println("Estilo: " + pintura1.getEstilo());
	 System.out.println("--------------------");
	 System.out.println("Escultura:");
	 System.out.println("Titulo: " + escultura1.getTitulo());
	 System.out.println("Autor: " + escultura1.getAutor());
	 System.out.println("Valor: $" + escultura1.getValor());
	 System.out.println("Material: " + escultura1.getMaterial());
	 System.out.println("Peso: " + escultura1.getPeso());
	 System.out.println("Altura: " + escultura1.getAltura());
	 System.out.println("--------------------");
	 System.out.println("Fotografia:");
	 System.out.println("Titulo: " + fotografia1.getTitulo());
	 System.out.println("Autor: " + fotografia1.getAutor());
	 System.out.println("Valor: $" + fotografia1.getValor());
	 System.out.println("Tipo camara: " + fotografia1.getTipoCamara());
	 System.out.println("Resolucion: " + fotografia1.getResolucion() + " megapíxeles");
	 System.out.println("Formato: " + fotografia1.getFormato());
	} 		
}

