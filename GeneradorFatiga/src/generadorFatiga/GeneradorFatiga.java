package generadorFatiga;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GeneradorFatiga {

	public static void main(String[] args) throws FileNotFoundException {

		final int maxValor = 100000;

		File archivo = new File("05_Fatiga.in");
		PrintWriter pw = new PrintWriter(archivo);
		
		pw.println(maxValor);
		for (int i = 0; i < maxValor; i++) {
			pw.println((int) (Math.random() * maxValor + 1) + " " + (int) (Math.random() * maxValor + 1));
		}

		pw.close();
	}

}
