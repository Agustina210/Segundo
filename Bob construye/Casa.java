package PracticoIII;

public class Casa extends Edificio{
    private int numHabitaciones;

	public Casa(String direccion, int numPisos, int numHabitaciones) {
		super(numPisos, direccion);
	    this.setNumHabitaciones (numHabitaciones);
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}


	public void mostrarInformacion() {

}
}
