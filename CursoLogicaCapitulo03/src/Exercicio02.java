import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite o primeiro nome: ");
		String primeiroNome = scanner.nextLine();
		
		System.out.printf("Digite o segundo nome: ");
		String segundoNome = scanner.nextLine();
		
		System.out.println("Nome completo: " + primeiroNome + " " + segundoNome);
		
		
		scanner.close();
		
	}

}
