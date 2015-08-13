package jogo;

public abstract class Agressor implements Destrutivel {
	private int forca = 10;
	
	public Agressor(int forca){
		this.forca = forca;
	}

	public void bater(Destrutivel dest){
		
		if(!dest.estaDestruido()){
			dest.danificar(forca);
			danificar(dest.revidar());
			System.out.println(toString() + " bateu em " + dest.toString());
			System.out.println("Minha vida " + this.getVida());
			System.out.println("Alvo  vida " + dest.getVida());
		}
	}

	@Override
	abstract public int getVida();

	@Override
	abstract public int getMaxVida();

	@Override
	public abstract void danificar(int dano);

	@Override
	abstract public int revidar();

	@Override
	public abstract boolean estaDestruido();
}
