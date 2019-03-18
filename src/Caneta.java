public class Caneta {

	//Atributos
	private String modelo;
	private String cor;
	private double ponta;
	private int carga;
	private boolean tampada;
	
	//Construtores
	public Caneta(String modelo, String cor, double ponta, boolean tampada) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.tampada = tampada;
	}

	public Caneta() {
		
	}
	
	//Métodos especiais
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public boolean getTampada() {
		return tampada;
	}
	
	//Métodos personalizados
	public void statusAtual() {
		System.out.println("Uma caneta do modelo" + this.modelo);
		System.out.println("Cor " + this.cor);
		System.out.println("ponta " + this.ponta);
		System.out.println("carga " + this.carga + "% ");
		System.out.println("tampada? " + this.tampada);
	}
	
	public void rabiscar(){
		if(this.tampada ==  false) {
			if(this.carga > 5) {
				System.out.println("Estou rabiscando... ");
				this.carga -= 10;
			}else if(this.carga == 5) {
				System.out.println("Estou rabiscando... ");
				this.carga -= 5;
			}
			
			else {
				System.out.println("ERRO! Não posso rabiscar, pois estou sem carga. ");
			}
		
		}else {
			System.out.println("ERRO! Não posso rabiscar, pois estou tampada. ");
		}
		
	}
	
	public void escrever() {
		if(this.tampada == false) {
			if(this.carga > 0) {
				System.out.println("Estou escrevendo... ");
				this.carga -= 5;
			}else {
				System.out.println("ERRO! Não posso escrever, pois estou sem carga. ");
			}
		}
		else if(this.carga <= 0) {
			System.out.println("ERRO! Não posso escrever, pois estou tampada. ");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	
	
	
	
	
	
	
	
	
}

