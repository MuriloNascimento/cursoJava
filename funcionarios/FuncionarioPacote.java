package funcionarios;

public class FuncionarioPacote {
	
	public static void main(String[] args){
		
		Funcionario f = new Funcionario();
		f.setNome("Murilo");
		System.out.println(f.getNome());
		f.setAtivo(false);
		System.out.println(f.isAtivo());
		
	}
}
