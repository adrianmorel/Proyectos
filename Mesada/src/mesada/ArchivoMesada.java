package mesada;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ArchivoMesada {

	public static ArrayList<Mesada> leer(String path) throws FileNotFoundException {
		File archivo = new File(path);
		Scanner sc = new Scanner(archivo);
		int cantMesas = sc.nextInt();

		ArrayList<Mesada> listaDeMesadas = new ArrayList<Mesada>();

		for (int i = 0; i < cantMesas; i++) {
			listaDeMesadas.add(new Mesada(sc.nextInt(), sc.nextInt()));
		}

		sc.close();
		return listaDeMesadas;
	}

	public static void escribir(int cantMinima) throws FileNotFoundException {

		File archivo = new File("05_Fatiga.out");
		PrintWriter pw = new PrintWriter(archivo);
		pw.print(cantMinima);
		pw.close();
	}

}
