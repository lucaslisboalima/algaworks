import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculadora Simples");
		
		System.out.printf("Informe o primeiro n�mero: ");
		Integer numero1 = scanner.nextInt();
		
		System.out.printf("[1] Adi��o | [2] Subtra��o | [3] Multiplica��o | [4] Divis�o: ");
		Integer operacao = scanner.nextInt();
		
		System.out.printf("Informe o segundo n�mero: ");
		Integer numero2 = scanner.nextInt();
		
		Integer resultado = 0;
		
		if(operacao == 1){
			resultado = numero1 + numero2;
			System.out.println(resultado);
			
		}else if(operacao == 2){
			resultado = numero1 - numero2;
			System.out.println("O resultado da subtra��o �: " + resultado);
			
		}else if(operacao == 3){
			resultado = numero1 * numero2;
			System.out.println("O resultado da multiplica��o �: " + resultado);
			
		}else if(operacao == 4){
			resultado = numero1 / numero2;
			System.out.println("O resultado da divis�o �: " + resultado);
			
		}else{
			System.out.println("Operador inv�lido.");
		}
	
		
		scanner.close();
		
	}

}