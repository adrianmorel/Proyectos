package luchadores;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArchivoTorneo {

	public static Torneo leer(String path) throws FileNotFoundException {
		File archivo = new File(path);
		Scanner sc = new Scanner(archivo);
		Luchador[] vec = new Luchador[sc.nextInt()];

		for (int i = 0; i < vec.length; i++) {
			vec[i] = new Luchador(sc.nextInt(), sc.nextInt());
		}

		sc.close();
		return new Torneo(vec);
	}

	public static void escribir(String path, int[] resultado) throws FileNotFoundException {
		File archivo = new File(path);
		PrintWriter pw = new PrintWriter(archivo);
				for(int i = 0; i<resultado.length; i++)
					pw.println(resultado[i]);
		pw.close();
	}

}
