package Interface;

public class FolhaPapel implements Area{
	
	public double largura;
	public double altura;
	
	public FolhaPapel(double largura, double altura){
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		return this.largura * this.altura;
	}
	
}
