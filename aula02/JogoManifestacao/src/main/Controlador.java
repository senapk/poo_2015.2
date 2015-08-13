package main;

public class Controlador {
	public static void main(String[] args) {
		Guarda jack = new Guarda();
		
		Froxo otario = new Froxo();
		
		Elemento fusca = new Elemento();
		
		fusca.update();
		otario.update();
		
		otario.bater(fusca);
		jack.bater(otario);
		
		fusca.update();
		otario.update();

	}
}
