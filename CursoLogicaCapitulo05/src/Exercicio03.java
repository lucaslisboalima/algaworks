import java.util.Scanner;

public class Exercicio03 {
	
	
	/*
	 * 
	 * Crie um programa que vai receber um n�mero que ser� referente ao dia da semana (de 1 at� 7). 
	 * Dependendo do n�mero informado voc� deve imprimir o nome desse dia.
	 * Se o n�mero 1 for informado, ent�o dever� ser impresso "domingo", se 2, ent�o "segunda-feira" e por ai vai.
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.printf("Digite o dia da semana: ");
		Integer dia = scanner.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Domingo.");
			break;
		case 2:
			System.out.println("Segunda-feira.");
			break;
		case 3:
			System.out.println("Ter�a-feira.");
			break;
		case 4:
			System.out.println("Quarta-feira.");
			break;
		case 5:
			System.out.println("Quinta-feira.");
			break;
		case 6:
			System.out.println("Sexta-feira.");
			break;
		case 7:
			System.out.println("S�bado.");
			break;
		default:
			System.err.println("Informe um dia v�lido.");
			System.exit(1);
			break;
		}
		
		
		
		scanner.close();
		
	}

}
