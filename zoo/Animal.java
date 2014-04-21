package zoo;

public abstract class Animal {
	
	protected double peso;
	protected String comida;
	
	public final void dormir(){
		System.out.println("zzzzz");
	}
	
	abstract void fazerBarulho();
	
	public Animal(double peso, String comida){
		this.peso = peso;
		this.comida = comida;
	}

}
