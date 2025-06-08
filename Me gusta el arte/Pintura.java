package PracticoIV;

public class Pintura extends ObraArte {
	private String tipoPintura;
	private String dimensiones;
	private String estilo; 
	
	public Pintura(String titulo, String autor, int valor, String tipoPintura, String dimensiones, String estilo) {
		super(titulo, autor, valor);
	    this.setTipoPintura (tipoPintura);
	    this.setDimensiones (dimensiones);
	    this.setEstilo (estilo);
	}

	public String getTipoPintura() {
		return tipoPintura;
	}

	public void setTipoPintura(String tipoPintura) {
		this.tipoPintura = tipoPintura;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public void mostrarInformacion() {
	}
}
