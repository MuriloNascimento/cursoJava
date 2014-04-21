package zoo;

public class Cachorro extends Animal {
	
	public Cachorro(int peso, String comida){
		super(peso, comida);
	}
	
	
	
	public void fazerBarulho(){
		System.out.println("Au au !");
	}
	
}
