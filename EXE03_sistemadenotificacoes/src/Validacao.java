public class Validacao {

    public static void validarMensagem(String mensagem) {
        if (mensagem == null || mensagem.trim().isEmpty()) {
            throw new IllegalArgumentException("Mensagem não pode ser vazia!");
        }
    }

    public static void validarDestinatario(String destinatario) {
        if (destinatario == null || destinatario.trim().isEmpty()) {
            throw new IllegalArgumentException("Destinatário não pode ser vazio!");
        }

        boolean email = destinatario.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        boolean telefone = destinatario.matches("^\\d{10,11}$");

        if (!email && !telefone) {
            throw new IllegalArgumentException("Destinatário deve ser email ou telefone válido!");
        }
    }
}