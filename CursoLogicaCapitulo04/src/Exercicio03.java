import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Double totalGastos = 0.0;
		
		System.out.print("Informe o valor da conta de luz: ");
		totalGastos += scanner.nextDouble();
		
		System.out.printf("Informe o valor da conta de água: ");
		totalGastos += scanner.nextDouble();
		
		System.out.printf("Informe o valor da conta de telefone: ");
		totalGastos += scanner.nextDouble();
		
		System.out.printf("Informe o valor do boleto da escola do filho: ");
		totalGastos += scanner.nextDouble();
		
		System.out.printf("Informe o valor da fatura do cartão: ");
		totalGastos += scanner.nextDouble();
		
		System.out.printf("Informe o valor gasto com o supermercado: ");
		totalGastos += scanner.nextDouble();
		
		System.out.println("O total de gastos é R$" + totalGastos);
		
		scanner.close();
		
	}

}
