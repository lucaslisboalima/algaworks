import java.util.Scanner;

public class CalcularImc {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Informe a sua altura: ");
		Double altura = scanner.nextDouble();
		
		System.out.printf("Informe o seu peso: ");
		Double peso = scanner.nextDouble();
		
		Double imc = peso / (altura * altura);
		
		System.out.println("O seu IMC é: " + imc);
		
		scanner.close();
	}

}
