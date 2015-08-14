package main;


public class Elemento implements Destruivel, NPC {
	private int pv;
	private final  int MAXPV = 100;
	
	public Elemento(){
		pv = MAXPV;
	}
	
	@Override
	public int getPV() {
		return pv;
	}

	@Override
	public int getMaxPV() {
		return MAXPV;
	}

	@Override
	public boolean isDestruido() {
		return (pv <= 0);
	}

	@Override
	public void danificar(int pv) {
		this.pv = this.pv - pv/2;
	}

	@Override
	public void update() {
		
		this.pv = this.pv + 1;
		System.out.println("Fusca pv " + pv);
		
	}
	
}
