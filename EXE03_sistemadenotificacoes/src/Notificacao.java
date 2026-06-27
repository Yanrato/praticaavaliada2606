public class Notificacao {

	private String destinatario;

	public Notificacao(String destinatario) {

		setDestinatario(destinatario);
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		Validacao.validarDestinatario(destinatario);
		this.destinatario = destinatario;
	}
	
	public void enviar(String mensagem) {
		Validacao.validarMensagem(mensagem);
		System.out.println("*******************************************************");
		System.out.println("                       MENSAGEM");
		System.out.println("*******************************************************");
		System.out.printf("Destinatario: %s%n", this.destinatario);
		System.out.printf("Mensagem: %s%n", mensagem);
		 

		
	}

}
