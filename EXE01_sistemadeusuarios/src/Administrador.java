public class Administrador extends Usuario{

	private String nivelDeAcesso;

	public Administrador(String nome, String email, String nivelDeAcesso) {
	    super(nome, email);
	    setNivelDeAcesso(nivelDeAcesso);
	}

	public String getNivelDeAcesso() {
		return nivelDeAcesso;
	}

	public void setNivelDeAcesso(String nivelDeAcesso) {
		Validacao.validaAcesso(nivelDeAcesso);
		this.nivelDeAcesso = nivelDeAcesso;
	}
	

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Nivel de acesso: %s%n", this.nivelDeAcesso);
	}
	
}
