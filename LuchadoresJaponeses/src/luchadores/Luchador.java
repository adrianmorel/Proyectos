package luchadores;

public class Luchador {
	private int p;
	private int h;

	public Luchador(int p, int h) {
		super();
		this.p = p;
		this.h = h;
	}

	public boolean domina(Luchador l) {
		if((this.h > l.h && this.p > l.p) ||
			(this.h > l.h && this.p == l.p) ||
			(this.h == l.h && this.p > l.p))
			return true;
		return false;
	}
}
