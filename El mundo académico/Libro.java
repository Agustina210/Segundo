package PracticoII;

public class Libro extends Publicacion{
private String editorial;
private int numPaginas;


 public Libro (String titulo, String autor, int añoPublicacion, String editorial, int numPaginas) {
	  super(titulo, autor, añoPublicacion);
	  this.editorial = editorial;
	  this.numPaginas = numPaginas;
 }
	  
	  public String getEditorial() {
	return editorial;
}

public void setEditorial(String editorial) {
	this.editorial = editorial;
}

public int getNumPaginas() {
	return numPaginas;
}

public void setNumPaginas(int numPaginas) {
	this.numPaginas = numPaginas;
}

@Override
public void mostrarInformacion() {
    System.out.println("Libro: " + getTitulo() + "Autor: " + getAutor() + "añoPublicacion: " + getAñoPublicacion() + editorial + numPaginas);
}



}