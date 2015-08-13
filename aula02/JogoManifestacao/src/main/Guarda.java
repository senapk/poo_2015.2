package main;

public class Guarda extends Agressor implements Destruivel  {
	
	private int pv;
	private final  int MAXPV = 100;
	
	public Guarda(){
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
		this.pv = this.pv - pv;
		
	}
	

}




















