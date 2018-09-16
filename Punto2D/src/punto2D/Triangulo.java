package punto2D;

public class Triangulo extends Figura {

	private double b;
	private double h;

	public Triangulo(String color, Punto origen, double b, double h) {
		super(color, origen);
		this.b = b;
		this.h = h;
	}

	@Override
	public double calcularArea() {

		return (this.b * this.h) / 2;
	}

}
