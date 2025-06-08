package PracticoIV;

  public class Escultura extends ObraArte{
	private String material;
	private double peso;
	private double altura;
	
  public Escultura(String titulo, String autor, int valor, String material, double peso, double altura) {
		super(titulo, autor, valor);
	    this.setMaterial (material);
	    this.setPeso (peso);
	    this.setAltura (altura);
	}
  
	public String getMaterial() {
	return material;
}

	public void setMaterial(String material) {
	this.material = material;
}

	public double getPeso() {
	return peso;
}

	public void setPeso(double peso) {
	this.peso = peso;
}

	public double getAltura() {
	return altura;
}

	public void setAltura(double altura) {
	this.altura = altura;
}

	public void mostrarInformacion() {
	}

}
