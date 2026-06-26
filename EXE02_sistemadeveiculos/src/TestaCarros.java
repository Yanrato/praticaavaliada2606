public class TestaCarros {

	public static void main(String[] args) {

		CarroEletrico c1 = criarCarroEletrico("Dolphin", 40, 80);
		c1.visualizar();
		c1.acelerar(30);
		
		
		try {
			c1.setModelo("");
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		try {
			c1.setVelocidade(-6);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		try {
			c1.setnivelBateria(0);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		try {
			c1.acelerar(200);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

	}

	public static CarroEletrico criarCarroEletrico(String modelo, int velocidade, int bateria) {
		return new CarroEletrico(modelo, velocidade, bateria);
	}

}
