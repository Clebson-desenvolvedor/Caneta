import java.util.Scanner;

public class ProgramaCaneta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\tBem-vindo ao programa Caneta\n\n"
				+ "\tEntre com as especificações:\n\n");
		
		System.out.println("Entre com o modelo:");
		String modelo = sc.next();
		
		System.out.println("Entre com a cor:");
		String cor = sc.next();
		
		System.out.println("Entre com a espessura da ponta:");
		double ponta = sc.nextDouble();
		
		Caneta caneta = new Caneta(modelo, cor, ponta);
		
		caneta.statusAtual();
		
		int opcao = 0;
		
		do {
			caneta.menu(opcao);
		} while (opcao != 6);
		
		caneta.encerrarPrograma();
		sc.close();
	}
}
