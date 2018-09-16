package luchadores;

public class Torneo {
	private Luchador luchadores [];

	public Torneo(Luchador[] luchadores) {
		super();
		this.luchadores = luchadores;
	}

	public int[] resolver() {
		
		int tamaño = this.luchadores.length;
		int [] salida = new int [tamaño];
		
		for(int i = 0; i < tamaño; i++){
			Luchador currentFighter = this.luchadores[i];
			for(int j = 0; j < tamaño; j++){
				if(i != j && currentFighter.domina(this.luchadores[j]))
					salida[i]++;
			}
				
		}
			
		return salida;
	}
	
	
}
