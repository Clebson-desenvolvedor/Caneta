import java.util.Scanner;

public class Caneta {
	
	Scanner sc = new Scanner(System.in);

	//Atributos
	private String modelo;
	private String cor;
	private double ponta;
	private int carga;
	private boolean tampada;
	int opcao;
	
	//Construtores
	public Caneta(String modelo, String cor, double ponta) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = 50;
		this.tampada = true;
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
		System.out.println("\t  ** Status da Caneta ** \n\n");
		System.out.println("Uma caneta do modelo " + this.modelo);
		System.out.println("Cor " + this.cor);
		System.out.println("ponta " + this.ponta);
		System.out.println("carga " + this.carga + "% ");
		if (tampada == true) {
			System.out.println("Tampada");
		}else {
			System.out.println("Destampada");
		}
		System.out.println("---------------------------------------------------------");
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
		if(tampada == true) {
			System.out.println("ERRO! não posso escrever, pois estou tampada! ");
		} else {
			if(carga > 0) {
				System.out.println("Estou esvrevendo... ");
				this.carga -= 5;
			} else {
				System.out.println("ERRO! não poss escrever, pois estou sem carga! ");
			}
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	
	public int menu(int opcao) {
		
		System.out.println("\tO que deseja fazer agora? \n"
				+ "\n1 - mostrar status da caneta"
				+ "\n2 - rabiscar"
				+ "\n3 - escrever"
				+ "\n4 - tampar"
				+ "\n5 - destampar"
				+ "\n6 - encerrar programa"
				+ "\n-------------------------------");

		opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			statusAtual();
			break;
		case 2:
			rabiscar();
			break;
		case 3:
			escrever();
			break;
		case 4:
			tampar();
			break;
		case 5:
			destampar();
			break;
		case 6:
			encerrarPrograma();
			break;
		default:
			System.out.println("Digite um comando válido");
			break;
		}
		return opcao;
	}
	
	public void encerrarPrograma() {
		System.out.println("\tPrograma encerrado!");
	}	
}
