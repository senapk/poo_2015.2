package jogo;

public class Controlador {
	public static void main(String[] args) {
		
		Guarda steve = new Guarda(5);
		Manifestante aragao = new Manifestante(50);
		Gato gato = new Gato();
		
		aragao.bater(gato);
		steve.bater(gato);
		steve.bater(aragao);
		steve.bater(aragao);
		steve.bater(aragao);
		steve.bater(aragao);
		steve.bater(aragao);
	}
}
