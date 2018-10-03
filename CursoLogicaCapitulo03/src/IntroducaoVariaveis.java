import java.util.Scanner;

public class IntroducaoVariaveis {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		Double valorProdutoComFrete = valorProduto + 2;
		
		System.out.println("Valor do produto com frete: " + valorProdutoComFrete);
		
		scanner.close();
		
	}

}
