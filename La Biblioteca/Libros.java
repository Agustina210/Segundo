package Labiblioteca;

public class Libros {
	private String Titulo;
	private String Autor;
	private int ISBN;
	
	public Libros(String Titulo, String Autor, int ISBN) {
		super ();
		this.setNombre(Titulo);
		this.setAutor(Autor);
		this.setISBN(ISBN);
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setNombre(String titulo) {
		Titulo = titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
}
