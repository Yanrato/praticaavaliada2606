
public class Validacao {

	public static void validaEmail(String email) {
		if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) 
			throw new IllegalArgumentException("\nEmail inválido!");
		

	}

	public static void validaNome(String nome) {
		  if (nome == null || nome.trim().isEmpty()) {
	            throw new IllegalArgumentException("\nNome não pode estar vazio!");
		}
}

	public static void validaAcesso(String niveldeAcesso) {
		if (niveldeAcesso == null || niveldeAcesso.trim().isEmpty())
		 throw new IllegalArgumentException("\nNivel de acesso não pode estar vazio");
	}
}
