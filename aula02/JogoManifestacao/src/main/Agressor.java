package main;

public class Agressor {
	
	void bater(Destruivel dest){
		if(dest.isDestruido())
			return;
		dest.danificar(10);
	}
	
}
