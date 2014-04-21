package carro;

public class CarroTeste {

	public static void main(String[] args) {
		
		Motor v12 = new Motor("V12",1018);
		
		Carro ferrari = new Carro("F50",300,4.1,v12);
		Carro mercedes = new Carro("M-ds",240,3.8,v12);
		System.out.println("Modelo = " + ferrari.modelo);
		System.out.println("Velocida maxima = " + ferrari.velocidadeMax + "km");
		System.out.println("Modelo = " + mercedes.modelo);
		System.out.println("Velocida maxima = " + mercedes.velocidadeMax + "km");
		System.out.println("total de carros = " + Carro.total);
		
		Carro audi = new Carro();
		audi.motor = v12;
		
		System.out.println("Potencia do audi = " + audi.motor.tipo);
		
		
		
		
	}

}
