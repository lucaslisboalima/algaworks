import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Informe um n�mero: ");
		Integer numero =  scanner.nextInt();
		
		Integer quadrado = numero * numero;
		
		System.out.println("O quadrado do n�mero " + numero + " � " + quadrado + ".");
		
		scanner.close();
		
	}

}
