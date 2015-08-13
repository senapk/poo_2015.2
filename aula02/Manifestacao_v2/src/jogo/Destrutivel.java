package jogo;

public interface Destrutivel {
	int getVida();
	int getMaxVida();
	void danificar(int dano);
	int revidar();
	boolean estaDestruido();
}
