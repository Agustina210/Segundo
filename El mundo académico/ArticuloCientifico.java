package PracticoII;

public class ArticuloCientifico extends Publicacion{
private String factorImpacto;
	
  public ArticuloCientifico(String titulo, String autor, int añoPublicacion, String factorImpacto) {
	  super(titulo, autor, añoPublicacion);
	  this.factorImpacto = factorImpacto;
	}
  
    public String getFactorImpacto() {
	    return factorImpacto;
    }

    public void setFactorImpacto(String factorImpacto) {
	    this.factorImpacto = factorImpacto;
    }
    @Override
	public void mostrarInformacion() {
	    System.out.println("Articulo cientifico: " + getTitulo() + "Autor: " + getAutor() + "añoPublicacion: " + getAñoPublicacion() + factorImpacto);
}
    
    
}