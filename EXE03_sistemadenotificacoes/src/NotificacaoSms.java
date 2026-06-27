public class NotificacaoSms extends Notificacao {

    public NotificacaoSms(String telefone) {
        super(telefone);
    }

    @Override
    public void enviar(String mensagem) {

        Validacao.validarMensagem(mensagem);

        String formatado = this.getDestinatario().replaceAll(
                "(\\d{2})(\\d{5})(\\d{4})",
                "($1) $2-$3"
        );

        System.out.println("*******************************************************");
        System.out.println("                 NOTIFICAÇÃO SMS");
        System.out.println("*******************************************************");
        System.out.printf("Enviando SMS para: %s%n", formatado);
        System.out.printf("Mensagem: %s%n", mensagem);
    }
}