import java.util.Scanner;

public class Exercicio05 {

	static final Integer NOTA_MINIMA_PARA_PASSAR_DE_ANO = 7;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Informe a nota do aluno: ");
		Double notaDoAluno = scanner.nextDouble();

		Boolean passouDeAno = notaDoAluno >= NOTA_MINIMA_PARA_PASSAR_DE_ANO;

		if (passouDeAno) {
			System.out.println("Parabéns!, Aprovado.");
		} else {
			System.out.println("Reprovado! Precisa estudar mais.");
		}

		scanner.close();

	}

}