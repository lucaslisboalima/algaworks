import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculadora Simples");
		
		System.out.printf("Informe o primeiro número: ");
		Integer numero1 = scanner.nextInt();
		
		System.out.printf("[1] Adição | [2] Subtração | [3] Multiplicação | [4] Divisão: ");
		Integer operacao = scanner.nextInt();
		
		System.out.printf("Informe o segundo número: ");
		Integer numero2 = scanner.nextInt();
		
		Integer resultado = 0;
		
		if(operacao == 1){
			resultado = numero1 + numero2;
			System.out.println(resultado);
			
		}else if(operacao == 2){
			resultado = numero1 - numero2;
			System.out.println("O resultado da subtração é: " + resultado);
			
		}else if(operacao == 3){
			resultado = numero1 * numero2;
			System.out.println("O resultado da multiplicação é: " + resultado);
			
		}else if(operacao == 4){
			resultado = numero1 / numero2;
			System.out.println("O resultado da divisão é: " + resultado);
			
		}else{
			System.out.println("Operador inválido.");
		}
	
		
		scanner.close();
		
	}

}