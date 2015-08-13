package jogo;

public class Gato implements Destrutivel {
	private int vida;
	private int vidaMax;
	public Gato(){
		vidaMax = 7;
		vida = vidaMax;
	}

	public int getVida() {
		return vida;
	}

	@Override
	public int getMaxVida() {
		return vidaMax;
	}

	@Override
	public void danificar(int dano) {
		vida = vida - dano;
		if(vida <= 0)
			if(vidaMax > 0){
				vidaMax -= 1;
				vida = vidaMax;
			}
	}

	public int revidar() {
		return vidaMax;
	}

	@Override
	public boolean estaDestruido() {
		return (vidaMax <= 0);
	}
	
	public String toString() {
		return "Gato";
	}

}
