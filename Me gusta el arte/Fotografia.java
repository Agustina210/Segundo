package PracticoIV;

public class Fotografia extends ObraArte{
	private String tipoCamara;
	private double resolucion;
	private String formato;
	
	 public Fotografia(String titulo, String autor, int valor, String tipoCamara, double resolucion, String formato){
			super(titulo, autor, valor);
		    this.setTipoCamara (tipoCamara);
		    this.setResolucion (resolucion);
		    this.setFormato (formato);
		}
	 
		public String getTipoCamara() {
		return tipoCamara;
	}

	public void setTipoCamara(String tipoCamara) {
		this.tipoCamara = tipoCamara;
	}

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

		public void mostrarInformacion() {
		}

}
