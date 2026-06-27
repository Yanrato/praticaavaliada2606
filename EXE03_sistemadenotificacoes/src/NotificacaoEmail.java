public class NotificacaoEmail extends Notificacao {

    public NotificacaoEmail(String email) {
        super(email);
    }

    @Override
    public void enviar(String mensagem) {
        Validacao.validarMensagem(mensagem);

        System.out.println("*******************************************************");
        System.out.println("                 NOTIFICAÇÃO EMAIL");
        System.out.println("*******************************************************");
        System.out.printf("Enviando Email para: %s%n", this.getDestinatario());
        System.out.printf("Mensagem: %s%n", mensagem);
    }
}