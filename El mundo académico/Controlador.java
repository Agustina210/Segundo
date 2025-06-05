package PracticoII;
import java.util.Scanner;

public class Controlador {
  public static void main(String[]arg) {
	  Scanner lector = new Scanner(System.in);
	
	  Libro libro = new Libro(null, null, 0, null, 0);

		 System.out.println("Ingresa un Libro: "); 
		 libro.setTitulo(lector.next());
		 
		 System.out.println("El autor: ");
		 libro.setAutor(lector.next());
		 
		 System.out.println("El año de publicación: ");
		 libro.setAñoPublicacion(lector.nextInt());
		 
		 System.out.println("Editorial: ");
		 libro.setEditorial(lector.next());
		 
		 System.out.println("Numero de paginas: ");
		 libro.setNumPaginas(lector.nextInt());
		 
		  Revista revista = new Revista(null, null, 0, null);
		  System.out.println("------------------");

			 System.out.println("Ingresa una revista: "); 
			 revista.setTitulo(lector.next());
			 
			 System.out.println("El autor: ");
			 revista.setAutor(lector.next());
			 
			 System.out.println("El año de publicación: ");
			 revista.setAñoPublicacion(lector.nextInt());
			 
			 System.out.println("El mes de publicación: ");
			 revista.setMesPublicacion(lector.next());
			 
		ArticuloCientifico articuloCientifico = new ArticuloCientifico(null, null, 0, null);
		 System.out.println("------------------");

			 System.out.println("Ingresa un articulo cientifico: "); 
			 articuloCientifico.setTitulo(lector.next());
			 
			 System.out.println("El autor: ");
			 articuloCientifico.setAutor(lector.next());
			 
			 System.out.println("El año de publicación: ");
			 articuloCientifico.setAñoPublicacion(lector.nextInt());
			
			 System.out.println("El factor de impacto: ");
			 articuloCientifico.setFactorImpacto(lector.next());
			 
			 System.out.println("----INFORMACION INGRESADA----");
			 System.out.println("Libro: " + libro.getTitulo() + " | Autor: " + libro.getAutor() + " | Año pubicacion: " + libro.getAñoPublicacion() + " | Numero editorial " + libro.getEditorial() + " | Numero de paginas: " + libro.getNumPaginas());
			 System.out.println("Revista: " + revista.getTitulo() + " | Autor: " + revista.getAutor() + " | Año publicacion: " + revista.getAñoPublicacion() + " | Mes publicacion " + revista.getMesPublicacion());
			 System.out.println("Articulo cientifico: " + articuloCientifico.getTitulo() + " | Autor: " + articuloCientifico.getAutor() + " | Año publicacion: " + articuloCientifico.getAñoPublicacion() + " | Factor de impacto: " + articuloCientifico.getFactorImpacto());

}
}
