package zoo;

public class AnimalTeste {
	
	public static void ConcatenaBarulhos(Animal ... animal){
		for(Animal i : animal){
			i.fazerBarulho();
		}
	}

	public static void main(String[] args) {
		
		Cachorro toto = new Cachorro(10,"racao");
		Cachorro nailon = new Cachorro(12,"racao");
		Galinha caricho = new Galinha(2,"alpiste");
		Galinha ana = new Galinha(3,"alpiste");
		
		ConcatenaBarulhos(nailon,toto,caricho,ana);
		
	}

}
