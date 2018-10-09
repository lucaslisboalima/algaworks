import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * Pense em uma empresa fict�cia que todo o m�s de Janeiro premia seus funcion�rios com um b�nus, caso a meta seja alcan�ada.
		 * Crie um programa que receba 3 par�metros. O primeiro ser� a meta de faturamento anual da empresa para o ano que passou. 
		 * Depois, receba o par�metro referente ao faturamento real da empresa no ultimo ano. Por �ltimo, 
		 * receba a m�dia salarial do funcion�rio(a) para o ano anterior (n�o precisa fazer c�lculo de m�dia salarial, 
		 * j� que estamos trabalhando com um algoritmo fict�cio - na hora de informar esse par�metro, invente um valor qualquer para representar essa m�dia salarial).
		 * Nessa empresa fict�cia, se o faturamento real for igual ou maior que a meta de faturamento anual, 
		 * ent�o os funcion�rios ganharam um b�nus que ser� igual a m�dia salarial deles no �ltimo ano. 
		 * Caso o faturamento seja menor que a meta, mas, seja maior ou igual a 80% do valor da meta, ent�o eles receber�o tamb�m 80% de sua m�dia salarial.
		 * No final, mostre de quanto ser� o pr�mio desse funcion�rio(a).
		 * 
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Meta de faturamento anual da empresa para o nao que passou: ");
		Double metaFaturamentoAnual = scanner.nextDouble();
		
		System.out.printf("Faturamento real da empresa no �ltimo ano: ");
		Double faturamentoReal = scanner.nextDouble();
		
		System.out.printf("M�dia salarial do funcion�rio para o ano anterior: ");
		Double mediaSalarial = scanner.nextDouble();
		
		Boolean metaAlcancada = faturamentoReal >= metaFaturamentoAnual;
		Boolean metaNaoAtingida = faturamentoReal < metaFaturamentoAnual;
		
		if(metaAlcancada){
			mediaSalarial += mediaSalarial;
			System.out.println(mediaSalarial);
		}else if(metaNaoAtingida){
			
		}
		
		//System.out.println(metaAlcancada);
		
		
		scanner.close();
		
	}

}
