import java.util.Scanner;

public class Exercicio01 {
	
	/*
	 * Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. 
	 * 
	 * Ser�o dois par�metros para receber um para receber a nota de portugu�s e outro para receber as de matem�tica.
	 * 
	 * A prova, no total, vale 200 pontos - 100 para cada mat�ria. A nota m�nima total para passar � igual ou maior que 150. 
	 * 
	 * Entretanto, o candidato n�o pode tirar menos do que 60 pontos em qualquer uma das duas mat�rias, ou seja, se tirar 59 em portugu�s e 100 em matem�tica
	 *  
	 * (totalizando uma nota maior do que o total necess�rio que � 150) ele n�o conseguir� a vaga.
	 * 
	 * No final mostre para o candidato se ele conseguiu ou n�o.
	 * 
	 */
	
	static final Integer NOTA_MINIMA_PARA_PASSAR = 150;
	static final Integer NOTA_CORTE = 60;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Boolean notaMinimaParaPassar = true;
		Boolean notaMenorQue60 = true;
		
		System.out.printf("Informe a nota de portugu�s: ");
		Integer notaPortugues = scanner.nextInt();
		
		System.out.printf("Informe a nota de matem�tica: ");
		Integer notaMatematica = scanner.nextInt();
		
		Boolean validarNota = notaPortugues < NOTA_CORTE || notaMatematica < NOTA_CORTE;
		
		Integer totalDasNotas = notaPortugues + notaMatematica;
		
		if(!validarNota && totalDasNotas >= NOTA_MINIMA_PARA_PASSAR){
			System.out.println("Nota atingida portugu�s: " + notaPortugues);
			System.out.println("Nota atingida matem�tica: " + notaMatematica);
			System.out.println("Aprovado.");
		}else{
			System.out.println("Nota atingida portugu�s: " + notaPortugues);
			System.out.println("Nota atingida matem�tica: " + notaMatematica);
			System.out.println("Reprovado.");
		}
		
		
		
		scanner.close();
		
	}

}
