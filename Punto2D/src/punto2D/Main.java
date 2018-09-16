package punto2D;

public class Main {

	public static void main(String[] args) {

		Punto punto = new Punto2D(1, 1);
		Punto punto2 = new Punto2D(1, 1);
		Punto punto3 = new Punto2D();
		Punto punto4 = new Punto3D(1, 1, 1);
		Punto punto5 = new Punto3D(2, 2, 2);

		System.out.println(punto3);

		System.out.println(punto.distanciaAlOrigen());

		System.out.println(punto.distanciaE2(punto2));

		System.out.println(punto4.distanciaAlOrigen());

		System.out.println(punto4.distanciaE2(punto5));

		System.out.println(punto5);

		Figura circulo = new Circulo("Negro", punto, 2);

		System.out.println(circulo.calcularArea());

		Figura rectangulo = new Rectangulo("Blanco", punto, 2, 2);

		System.out.println(rectangulo.calcularArea());

		Figura triangulo = new Triangulo("Rojo", punto, 2, 2);

		System.out.println(triangulo.calcularArea());

		Figura[] vectorFigura = new Figura[10];

		for (int i = 0; i < 5; i++) vectorFigura[i] = new Circulo("Amarillo", punto, 1);
		vectorFigura[5] = new Triangulo("Amarillo", punto, 2,2);
		vectorFigura[6] = new Rectangulo("Amarillo", punto, 0.5,0.5);
		vectorFigura[7] = new Rectangulo("Amarillo", punto, 1,1);
		vectorFigura[8] = new Rectangulo("Amarillo", punto, 2,4);
		vectorFigura[9] = new Rectangulo("Amarillo", punto, 2,4);
		
		double resultadoFinal = 0;
		
		for(Figura f1:vectorFigura) {
			resultadoFinal += f1.calcularArea();
		}
		System.out.println("El area de la wea es: " + resultadoFinal);
	}
}