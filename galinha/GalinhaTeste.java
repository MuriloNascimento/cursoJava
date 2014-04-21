package galinha;

public class GalinhaTeste {

	public static void main(String[] args) {
		
		Galinha filomena = new Galinha();
		filomena.botar().botar().botar().botar();
		
		Galinha Anastacia = new Galinha();
		Anastacia.botar().botar();
		
		System.out.println("Ovos da filomena = " + filomena.ovos);
		System.out.println("Ovos da Anastacia = " + Anastacia.ovos);
		
		System.out.println("Ovos da Granja = " + Galinha.ovosDaGranja);
		System.out.println("Media de Ovos da granja = " + Galinha.mediaOvos(2));
		
	}

}
