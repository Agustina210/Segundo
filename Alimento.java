package Practico;

public class Alimento extends Producto{
	private String fechaCaducidad;

	public Alimento(String nombre, double precio, String fechaCaducidad) {
		super(nombre, precio);
		this.setFechaCaducidad (fechaCaducidad);
	}
	
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	  @Override
	    public void mostrarInformacion() {
	        System.out.println("Alimento: " + getNombre() + " | Fecha de caducidad: " + fechaCaducidad + " | Precio: $" + getPrecio());
	    }

}


	

		
	
