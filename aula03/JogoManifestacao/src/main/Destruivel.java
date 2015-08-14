package main;

public interface Destruivel {
	int getPV();
	int getMaxPV();
	boolean isDestruido();
	void danificar(int pv);
}
