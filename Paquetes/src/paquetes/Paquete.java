package paquetes;

public class Paquete {
	
	private double peso;
	private double distancia;
	private double volumen;

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public Paquete(double peso) {
		super();
		this.setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVolumen() {
		return volumen;
	}
	
}
