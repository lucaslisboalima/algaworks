import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Informe a nota do aluno: ");
		Double notaDoAluno = scanner.nextDouble();

		Boolean passouDeAno = notaDoAluno >= 7;

		if (passouDeAno) {
			System.out.println("Parabéns!, Aprovado.");
		} else {
			System.out.println("Reprovado! Precisa estudar mais.");
		}

		scanner.close();

	}

}