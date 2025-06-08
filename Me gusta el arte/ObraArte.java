package PracticoIV;

public abstract class ObraArte {
	private String titulo;
	private String autor;
	private int valor;
	
	public ObraArte(String titulo, String autor, int valor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.valor = valor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	public abstract void mostrarInformacion();
}
