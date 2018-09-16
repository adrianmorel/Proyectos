package punto2D;

public class Punto3D extends Punto2D {

	private double z;

	public Punto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	public double distanciaAlOrigen() {
		return Math.abs((Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2) + Math.pow(this.z, 2))));
	}

	public double distanciaE2(Punto3D otro) {
		return Math.abs(this.distanciaAlOrigen() - otro.distanciaAlOrigen());
	}

	@Override
	public String toString() {
		return "Punto3D [x= " + this.getX() + ", y= " + this.getY() + ", z= " + this.z + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(z);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto3D other = (Punto3D) obj;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
			return false;
		return true;
	}
	
	
	
}
