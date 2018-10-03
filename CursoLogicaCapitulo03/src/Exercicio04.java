import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		/*
		 *  
		 * Crie um programa que vai receber do usu�rio o valor do produto e a quantidade do produto que se deseja. 
		 * Com essas informa��es encontre o subtotal que ser� o valor do produto multiplicado pela quantidade.
		 * Depois voc� vai precisar usar uma estrutura de decis�o. Se a quantidade desejada do produto for maior que 10 unidades, 
		 * vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor que 10, voc� N�O aplica desconto algum.
		 * Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade) 
		 * voc� multiplica o subtotal pelo pr�prio percentual e divide tudo por 100.Tendo o valor referente ao percentual de desconto, 
		 * voc� vai retirar esse valor do subtotal. O que sobrar ser� o valor total final e dever� ser apresentado no console.
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Informe o valor do produto: ");
		Double valorDoProduto = scanner.nextDouble();
		
		System.out.printf("Informe a quantidade do produto; ");
		Integer quantidadeDeProdutos = scanner.nextInt();
		
		Double subtotal = quantidadeDeProdutos * valorDoProduto;
		
		if(quantidadeDeProdutos > 10){
			
			System.out.printf("Informe o desconto: ");
			Integer desconto = scanner.nextInt();
			
			Double totalComDesconto =  subtotal * desconto / 100;
			
			totalComDesconto = subtotal - totalComDesconto;
			
			System.out.println("Com desconto concedido de " + desconto + "% o total da compra foi de R$ " + totalComDesconto + ".");
			
		}else{
			System.out.println("O total da compra foi de: " + subtotal);
		}
		
		scanner.close();
		
	}

}
