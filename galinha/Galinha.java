package galinha;

public class Galinha {
	public static int ovosDaGranja;
	public int ovos;
	
	public Galinha botar(){
		this.ovos++;
		Galinha.ovosDaGranja++;
		return this;
	}
	
	public static double mediaOvos(int quantidadeGalinhas){
		return Galinha.ovosDaGranja / quantidadeGalinhas;
	}
	
}
