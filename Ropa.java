package Practico;

public class Ropa extends Producto{
	private String talla;
	
	public Ropa(String nombre, double precio, String talla) {
		super(nombre, precio);
		this.setTalla (talla);
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}
	
	  @Override
	    public void mostrarInformacion() {
	        System.out.println("Ropa: " + getNombre() + " | Talla: " + talla + " | Precio: $" + getPrecio());
	    }
}
