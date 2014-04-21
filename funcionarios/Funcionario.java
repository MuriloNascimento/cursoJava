package funcionarios;

public class Funcionario {

	private String nome;
	private boolean ativo;
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nomeInformado){
		this.nome = nomeInformado;
	}
	
	public boolean isAtivo(){
		return ativo;
	}
	
	public void setAtivo(boolean ativoInformado){
		this.ativo = ativoInformado;
	}
	
	public static void main(){
		Funcionario f = new Funcionario();
		f.nome = "murilo";
	}
	
}
