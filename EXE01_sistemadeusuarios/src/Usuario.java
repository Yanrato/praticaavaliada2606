public class Usuario {

	private String nome;
	private String email;

	public Usuario(String nome, String email) {
	    setNome(nome);
	    setEmail(email);
	}

	public void descricaoUsuario() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
	Validacao.validaNome(nome);
	this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		Validacao.validaEmail(email);
		this.email = email;

	}

	public void visualizar() {

		System.out.println("*******************************************************");
		System.out.println("                    DADOS DO USUARIO                 ");
		System.out.println("*******************************************************");
		System.out.printf("Nome: %s%n", this.nome);
		System.out.printf("Email: %s%n", this.email);
	}

}
