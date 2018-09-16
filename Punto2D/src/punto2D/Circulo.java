package punto2D;

public class Circulo extends Figura {

	private double radio;

	public Circulo(String color, Punto origen, double radio) {
		super(color, origen);
		this.radio = radio;
	}

	public double calcularArea() {
		return (Math.PI * Math.pow(this.radio, 2));
	}

}
