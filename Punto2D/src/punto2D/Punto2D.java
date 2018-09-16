package punto2D;

public class Punto2D implements Punto{
	private double x;
	private double y;

	public Punto2D(double x, double y) {
		this.x = x;		
		this.y = y;
	}
	
	public Punto2D() {
		this(0, 0);
	}
	
	public double distanciaAlOrigen() {
		return Math.abs((Math.sqrt(Math.pow(this.x, 2)+ Math.pow(this.y, 2))));
	}
	
	public double distanciaE2(Punto2D otro) {
		
		return Math.abs(this.distanciaAlOrigen() - otro.distanciaAlOrigen());
	}

	@Override
	public String toString() {
		return "Punto2D [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto2D other = (Punto2D) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	
	
	public Punto2D desplazar(Punto2D otro) {
		return new Punto2D(this.x + otro.x, this.y + otro.y); 
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}


	@Override
	public void desplazamiento(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double distanciaE2(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
