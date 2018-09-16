package mesada;

public class Mesada {

	private int ancho;
	private int largo;

	public Mesada(int ancho, int largo) {
		this.ancho = ancho;
		this.largo = largo;
	}

	public boolean puedoApilar(Mesada otra) {
		if (this.ancho <= otra.ancho && this.largo <= otra.largo
				|| this.ancho <= otra.largo && this.largo <= otra.ancho)
			return true;
		else
			return false;
	}

}
