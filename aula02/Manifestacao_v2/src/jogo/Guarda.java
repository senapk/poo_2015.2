package jogo;

public class Guarda extends Agressor {
	private int vida;
	private int resistencia;
	private final int vidaMax = 100;
	private static final int forcaMaxGuarda = 10;
	
	public Guarda(int resistencia){
		super(forcaMaxGuarda);
		vida = vidaMax;
		this.resistencia = resistencia;
	}
	
	public int getVida() {
		return vida;
	}

	public int getMaxVida() {
		return vidaMax;
	}

	public void danificar(int dano) {
		if(dano < resistencia)
			return;
		vida = vida - (dano - resistencia);
	}

	public int revidar() {
		return resistencia;
	}

	public boolean estaDestruido() {
		return (vida <= 0);
	}
	
	public String toString() {
		return "Guarda";
	}

}
