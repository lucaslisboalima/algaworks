import java.util.Scanner;

public class Vetores1Dimensao {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		String[] cardapio = new String[]{"Calabresa", "Atum", "Queijo", "Presunto"};
		
		System.out.println("Escolha o sabor:");
		
		for(int i = 0; i < cardapio.length; i++){
			System.out.println("[" + i + "]" + cardapio[i]);
		}
		
		System.out.printf("Digite o número referente ao sabor: ");
		Integer saborEscolhido = scanner.nextInt();
		
		System.out.println("Você escolheu o sabor: " + cardapio[saborEscolhido]);
		
		*/
		 
		String[] cardapio = new String[]{"Calabresa", "Atum", "Queijo", "Presunto"};
		cardapio[3] = "Frango"; //Alterando a posição do vetor
		
		for(int i = 0; i < cardapio.length; i++){
			System.out.println(cardapio[i]);
		}
		
		scanner.close();
	}

}
