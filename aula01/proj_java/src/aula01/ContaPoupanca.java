package aula01;

import java.util.ArrayList;

class ContaPoupanca{
	private float saldo;
	private String numero;
	private String[] titulares;
	private float limiteSaque;
	private ArrayList<Float> operacoes;
	
	public ContaPoupanca(){
		saldo = 10;
		limiteSaque = 1000;
	};
	
	public ContaPoupanca(float saldo){
		this.saldo = saldo;
		limiteSaque = 1000;
	};
	
	public float getSaldo(){
		return saldo;
	}
	
	public boolean debitar(float value){
		if(saldo > value){
			saldo = saldo - value;
			return true;
		}
		return false;
	}
	
	public boolean sacar(float value){
		if(saldo > value && value < limiteSaque){
			saldo = saldo - value;
			return true;
		}
		return false;
	}
	
	public boolean creditar(float value){
		if(value < 0)
			return false;
		saldo += value;
		return true;
	}
	
	public static void main(String args[]){
		ContaPoupanca cpDavid = new ContaPoupanca();
		System.out.println(cpDavid.getSaldo());
		cpDavid.debitar(100);
		System.out.println(cpDavid.getSaldo());
		cpDavid.debitar(9);
		System.out.println(cpDavid.getSaldo());
		cpDavid.creditar(8000);
		System.out.println(cpDavid.getSaldo());
		cpDavid.sacar(1500);
		System.out.println(cpDavid.getSaldo());
	}
}














