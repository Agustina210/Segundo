package PracticoIII;

public class Apartamento extends Edificio{
	private int piso;
	private int numBaños;
	
	public Apartamento(String direccion, int numPisos, int piso, int numBaños) {
		super(numPisos, direccion);
	    this.setPiso (piso);
	    this.setNumBaños (numBaños);
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public int getNumBaños() {
		return numBaños;
	}

	public void setNumBaños(int numBaños) {
		this.numBaños = numBaños;
	}
	 public void mostrarInformacion() {
		 
	 }
}
