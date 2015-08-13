package jogo;

//DRY - SECO
//Don't repeat yourself

public class Manifestante extends Agressor {
	private int vidaMax;
	private int vida;
	
	public Manifestante(int vidaInicial){
		super(5);
		vidaMax = vidaInicial;
		vida = vidaInicial;
	}
	
	public int getVida() {
		return vida;
	}

	public int getMaxVida() {
		return vidaMax;
	}

	public void danificar(int dano) {
		vida -= dano;
	}

	@Override
	public int revidar() {
		return 0;
	}

	@Override
	public boolean estaDestruido() {
		return (vida < vidaMax / 2);
	}

	public String toString() {
		return "Froxo";
	}
	
}
