package main;

public class Froxo extends Agressor implements NPC, Destruivel {
	private int pv;
	private final int maxpv = 100;
	
	public Froxo(){
		pv = 100;
	}
	@Override
	public int getPV() {
		return pv;
	}

	@Override
	public int getMaxPV() {
		return maxpv;
	}

	@Override
	public boolean isDestruido() {
		return (pv < 50);
	}

	@Override
	public void danificar(int pv) {
		this.pv -= pv * 2;
	}

	@Override
	public void update() {
		if(pv == maxpv)
			System.out.println("Podem vir!!!!!! Seus merdas");
		else if(isDestruido())
			System.out.println("Socorro Mamae, eu me rendo");
		else
			System.out.println("Corre");
	}

}
