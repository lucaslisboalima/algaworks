import java.util.Scanner;

public class CalcularValorTroco {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Informe o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.printf("Informe o valor recebido: ");
		Double valorRecebido = scanner.nextDouble();
		
		Double resultado = valorRecebido - valorProduto;
		
		System.out.println("Troco: " + resultado);
		
		scanner.close();
	}

}
