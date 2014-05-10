package bancodedados;

public class Usuario {
	
	private String nome;
	private String email;
	
	public String getNome(){
		return this.nome;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public Usuario(String nome, String email){
		this.nome = nome;
		this.email = email;
	}

}
