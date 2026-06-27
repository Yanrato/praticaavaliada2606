public class TestaNotificacoes {

	public static void main(String[] args) {

		criarNotificacao("Email", "ana@email.com", "Bem-vindo ao sistema");

		criarNotificacao("SMS", "11988887777", "Seu código é 1234");

		try {
			criarNotificacao("WhatsApp", "123", "teste");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			criarNotificacao("Email", "", "teste");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			criarNotificacao("SMS", "11988887777", "");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void criarNotificacao(String tipo, String destinatario, String mensagem) {

        Notificacao notificacao;

        switch (tipo.toLowerCase()) {

            case "email"->{
                notificacao = new NotificacaoEmail(destinatario);
            }

            case "sms" ->{
                notificacao = new NotificacaoSms(destinatario);
            }

            default->{
                throw new IllegalArgumentException("Tipo de notificação inválido!");
            }}

        notificacao.enviar(mensagem);
    }
}