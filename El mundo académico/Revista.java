package PracticoII;

public class Revista extends Publicacion{
private String mesPublicacion;

	public Revista(String titulo, String autor, int añoPublicacion, String mesPublicacion) {
       super(titulo, autor, añoPublicacion);
       this.mesPublicacion = mesPublicacion;
	}

	public String getMesPublicacion() {
		return mesPublicacion;
	}

	public void setMesPublicacion(String mesPublicacion) {
		this.mesPublicacion = mesPublicacion;
	}
	@Override
	public void mostrarInformacion() {
	    System.out.println("Revista: " + getTitulo() + "Autor: " + getAutor() + "añoPublicacion: " + getAñoPublicacion() + mesPublicacion);
}
	
	

	
}