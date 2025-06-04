package Practico;

public class Electronica extends Producto{
	private String marca;
	
	public Electronica(String nombre, double precio, String marca) {
		super(nombre, precio);
		this.setMarca (marca);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	 @Override
	    public void mostrarInformacion() {
	        System.out.println("Electrónica: " + getNombre() + " | Marca: " + marca + " | Precio: $" + getPrecio());
	    }

	}

