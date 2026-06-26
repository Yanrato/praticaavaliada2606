public class Carro {

	private String modelo;
	private int velocidade;

	public Carro(String modelo, int velocidade) {

		setModelo(modelo);
	    setVelocidade(velocidade);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		validacao.validaModelo(modelo);
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		validacao.validaVelocidade(velocidade);
		this.velocidade = velocidade;
	}

	public void visualizar() {

		System.out.println("*******************************************************");
		System.out.println("                    DADOS DO CARRO               ");
		System.out.println("*******************************************************");
		System.out.printf("Carro: %s%n", this.modelo);
		System.out.printf("Velocidade: %d km/h %n", this.velocidade);	}

	public void acelerar(int valorAcelerarcao) {
		validacao.validaAceleracao(valorAcelerarcao);
		setVelocidade(this.velocidade + valorAcelerarcao);
		
	}
}
