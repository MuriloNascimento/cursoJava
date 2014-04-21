package Interface;

public class Quadrado implements Area {
	
	public double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return this.lado * this.lado;
	}
	
}
