import java.util.Scanner;

public class Exercicio04 {

	/*
	 * Crie um programa que receba a idade de uma pessoa e a quantidade de tempo
	 * que essa pessoa contribuiu com a previd�ncia, depois verifique se ela
	 * pode aposentar ou n�o. Nas regras desse programa a pessoa vai precisar
	 * ter, pelo menos, 55 anos e ter contribu�do com, pelo menos, 25 anos. Se
	 * ela passar nessas duas condi��es, ent�o mostre pra ela uma mensagem
	 * dizendo que ela pode aposentar.
	 * 
	 */
	
	static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
	
	static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO  = 25;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Informe a idade: ");
		Integer idade = scanner.nextInt();

		System.out.printf("Informe o tempo de contribui��o: ");
		Integer tempoContribuicao = scanner.nextInt();

		Boolean podeAposentar = idade > IDADE_MINIMA_PARA_APOSENTAR && tempoContribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO;

		if (podeAposentar) {
			System.out.println("Sim! Ele(a) pode se aposentar.");
		} else {
			System.out.println("N�o! Ele(a) n�o pode se aposentar.");
		}

		scanner.close();

	}

}
