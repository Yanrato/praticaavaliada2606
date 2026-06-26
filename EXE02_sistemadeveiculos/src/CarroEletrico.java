public class CarroEletrico extends Carro{

	private int nivelBateria;
	public static final int CONSUMO_POR_ACELERACAO = 2;
	
	public CarroEletrico(String setModelo, int setVelocidade, int setnivelBateria) {
		super(setModelo, setVelocidade);
		setnivelBateria(setnivelBateria);		
	}

	public int getnivelBateria() {
		return nivelBateria;
	}

	public void setnivelBateria(int bateria) {
		validacao.validaBateria(bateria);
		this.nivelBateria = bateria;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Bateria: %d%%", this.nivelBateria);
	}
	
	@Override
	public void acelerar(int valorAceleracao) {
		validacao.validaAceleracao(valorAceleracao);
		int consumoDaBateria = valorAceleracao*CONSUMO_POR_ACELERACAO;
		validacao.validaConsumo(nivelBateria, consumoDaBateria);
		int atualBateria = nivelBateria - consumoDaBateria;
		setnivelBateria(atualBateria);
		super.acelerar(valorAceleracao);
		System.out.printf("\nAcelerou para: %d km/h", getVelocidade());
		System.out.printf("\nBateria Atual: %d%%", getnivelBateria());
		
	}
}
