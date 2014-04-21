package carro;

public class Carro {
	
	String modelo;
	int velocidadeMax;
	double segundosZeroACem;
	static int total;
	Motor motor;
	
	public Carro(){}
	
	public Carro(String modelo, int velocidadeMax, double segundosZeroACem, Motor motor){
		this.modelo = modelo;
		this.velocidadeMax = velocidadeMax;
		this.segundosZeroACem = segundosZeroACem;
		this.motor = motor;
		Carro.total++;
		
	}
	
	
}
