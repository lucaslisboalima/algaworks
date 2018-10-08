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
	
	static final Double NOTA_MINIMA_PARA_PASSAR = 150.0;
	static final Double NOTA_CORTE = 60.0;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Informe a nota de portugu�s: ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.printf("Informe a nota de matem�tica: ");
		Double notaMatematica = scanner.nextDouble();
		
		Boolean validarNota = notaPortugues < NOTA_CORTE || notaMatematica < NOTA_CORTE;
		
		Double totalDasNotas = notaPortugues + notaMatematica;
		
		if(!validarNota && totalDasNotas >= NOTA_MINIMA_PARA_PASSAR){
			System.out.println("Parab�ns! Voc� Passou.");
		}else{
			System.out.println("Infelizemente, n�o foi dessa vez.");
		}
		
		scanner.close();
		
	}

}
