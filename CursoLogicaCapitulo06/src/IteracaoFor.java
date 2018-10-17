import java.util.Scanner;

//La�o for � utilizado quando se tem uma quatidade de itera��es conhecidas
public class IteracaoFor {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		for(int i = 0; i < 5; i++){	
			System.out.println(i + ": Uma frase qualquer.");
		}
		*/
		
		
		//Declara��o de Array
		/*
		Double[] carrinhoDeCompras = new Double[] {50.0, 51.0, 52.0};
		
		Double total = 0.0;
		
		for(Integer i = 0; i < carrinhoDeCompras.length; i++){
			
			System.out.println("Itera��o: " + i + ", Total: " + total);
			total += carrinhoDeCompras[i];
			
		}
		
		System.out.println("Total: " + total);
		*/
		
		//Itera��o usando break
		/*
		for(Integer i = 0; i < 10; i++){
			
			if(i.equals(5)){
				System.out.println("Vai parar!");
				break;
			}
			
			System.out.println("Itera��o: " + i);
		}
		*/
		
		//Itera��o usando continue
		/*
		for (Integer i = 0; i < 10; i++) {

			if (i == 5)) {
				System.out.println("Vai continuar!");
				continue;
			}

			System.out.println("Itera��o: " + i);
		}
		*/
		
		Integer[] produtos = new Integer[]{100, 225, 300};
		
		for(int i = 0; i < produtos.length; i++){
			
			Integer produto = produtos[i];
			
			System.out.println("Produto de c�digo: " + produto);
			
			if(produto.equals(225)){
				System.out.println("Produto encontrado!");
				break;
			}
		}
		
		scanner.close();
		
	}

}
