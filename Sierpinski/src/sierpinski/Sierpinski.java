package sierpinski;

public class Sierpinski {

	/*
	 * public boolean esSierpinski(int k) { for (int n = 1; n <= 1000; n++) if
	 * (esPrimo(k * Math.pow(2, n) + 1)) return false; return true; }
	 * 
	 * public boolean esPrimo(double nro) {
	 * 
	 * int cont = 2;
	 * 
	 * if(nro == 1) return true;
	 * 
	 * while ((true) && (cont != nro)) { if (nro % cont == 0) return false;
	 * cont++; } return true; } }
	 */

	public boolean esSierpinski(int k) {
		if (k % 2 == 0)
			return false;
		long n;
		for (int i = 0; i <= 1000; i++) {
			n = (long) (k * Math.pow(2, i) + 1);
			if (esPrimo(n))
				return false;
		}

		return true;
	}

	public boolean esPrimo(long k) {
		if (k < 2)
			return false;
		for (int i = 2; i <= (k / 2); i++) {
			if (k % i == 0)
				return false;

		}
		return true;
	}
}