package mesada;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Deposito d1 = new Deposito(ArchivoMesada.leer("05_Fatiga.in"));
		ArchivoMesada.escribir(d1.calcularMinimo());
	}
}
