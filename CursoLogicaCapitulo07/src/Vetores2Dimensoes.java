import java.util.Scanner;

public class Vetores2Dimensoes {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Double faturamentoDia = 1000.0;
		
		//Vetores de 1 Dimensão
		Double[] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 1700.0};
		Double[] faturamentoFevereiro = new Double[] {1000.0, 2500.0, 1800.0};
		
		//Para declarar vetor de 2 dimens�o se coloca dois colchetes
		//Vetor de 2 Dimensão, precisa ter array de 1 dimensão
		Double[][] faturamentoAnual = new Double[][] {faturamentoJaneiro, faturamentoFevereiro};
		
		//System.out.println("Faturamento do dia 1 de Janeiro: " + faturamentoAnual[0][0]);
		//System.out.println("Faturamento do dia 3 de Fevereiro: " + faturamentoAnual[1][2]);
		
		for(int i = 0; i < faturamentoAnual.length; i++){
			System.out.println("Mês: " + (i + 1));
			
			Double[] mes = faturamentoAnual[i];
			
			for(int y = 0; y < mes.length; y++){
				Double dia = mes[y];
				System.out.println("Dia " + (y + 1) + ": " + dia);
			}
		}
		
		scanner.close();
		
	}

}
