package PracticoIII;

public abstract class Edificio {
	private String direccion;
	private int numPisos; 

 
 public Edificio(int numPisos, String direccion) {
		super();
		this.direccion = direccion;
		this.numPisos = numPisos;
	}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public int getNumPisos() {
	return numPisos;
}

public void setNumPisos(int numPisos) {
	this.numPisos = numPisos;
}

public abstract void mostrarInformacion();
}
