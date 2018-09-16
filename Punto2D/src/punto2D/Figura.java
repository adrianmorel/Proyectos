package punto2D;

public abstract class Figura {
	
	private String color;
	private Punto origen;
	
	public Figura(String color, Punto origen) {
		this.color = color;
		this.origen = origen;
	}
	
	public abstract double calcularArea();

	public String getColor() {
		return color;
	}

	public Punto getOrigen() {
		return origen;
	}
	
}
