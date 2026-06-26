public class validacao {

	public static void validaModelo(String modelo) {
		if (modelo == null || modelo.trim().isEmpty()) {
			throw new IllegalArgumentException("\nCarro não pode estar vazio!");
		}
	}

	public static void validaVelocidade(int velocidade) {
		if (velocidade < 0) {
			throw new IllegalArgumentException("A velocidade do carro não pode ser negativa");
		} 
	}

	public static void validaBateria(int nivelBateria) {
		if (nivelBateria < 0 || nivelBateria > 100) {
		    throw new IllegalArgumentException("A bateria deve estar entre 0 e 100.");
		}
	}

	public static void validaAceleracao(int aceleracao) {
		if (aceleracao <= 0) {
			throw new IllegalArgumentException("Aceleração deve ser maior que zero");
		}
	}
	
	public static void validaConsumo(int bateria, int consumo) {
		if (consumo > bateria) {
			throw new IllegalArgumentException("Aceleração ultrapassa a bateria!");
		}
	}
}
