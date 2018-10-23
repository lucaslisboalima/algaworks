import java.util.Scanner;

public class Exercicio02 {
	
	/*
	 * Crie um programa que receba o valor de um produto e exiba o valor final da compra. 
	 * Esse valor final será o valor do produto mais o valor do frete - use o valor do frete como R$15,00. 
	 * Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00.
	 * Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.
	 * 
	 */
	
	static final Double VALOR_FRETE = 15.00;
	static final Double VALOR_DE_COMPRA_MINIMA = 100.00;
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		Double totalCompra = 0.0;
		
		System.out.printf("Informe o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		if(valorProduto >= VALOR_DE_COMPRA_MINIMA){
			totalCompra = valorProduto;
			System.out.println("Valor total da compra é: " + totalCompra);
		}else{
			totalCompra = valorProduto + VALOR_FRETE;
			System.out.println("Valor da compra com frete incluso de R$" + VALOR_FRETE + " é R$" + totalCompra);
		}
		
		/*
		 *  
		 *  System.out.print("Valor do produto: ");
			Double valorProduto = scanner.nextDouble();
		
			Boolean precisaCobrarFrete = valorProduto < 100;
		
			Double valorFinal = valorProduto;
		
				if (precisaCobrarFrete) {
					valorFinal += 15.0;
				}
		
				System.out.println("Valor final: " + valorFinal);
		 * 
		 * 
		 */
		
		scanner.close();
		
	}

}
