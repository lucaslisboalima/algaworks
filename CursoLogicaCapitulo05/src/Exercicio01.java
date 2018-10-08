import java.util.Scanner;

public class Exercicio01 {
	
	/*
	 * Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. 
	 * 
	 * Serão dois parâmetros para receber um para receber a nota de português e outro para receber as de matemática.
	 * 
	 * A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150. 
	 * 
	 * Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja, se tirar 59 em português e 100 em matemática
	 *  
	 * (totalizando uma nota maior do que o total necessário que é 150) ele não conseguirá a vaga.
	 * 
	 * No final mostre para o candidato se ele conseguiu ou não.
	 * 
	 */
	
	static final Integer NOTA_MINIMA_PARA_PASSAR = 150;
	static final Integer NOTA_CORTE = 60;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Boolean notaMinimaParaPassar = true;
		Boolean notaMenorQue60 = true;
		
		System.out.printf("Informe a nota de português: ");
		Integer notaPortugues = scanner.nextInt();
		
		System.out.printf("Informe a nota de matemática: ");
		Integer notaMatematica = scanner.nextInt();
		
		Boolean validarNota = notaPortugues < NOTA_CORTE || notaMatematica < NOTA_CORTE;
		
		Integer totalDasNotas = notaPortugues + notaMatematica;
		
		if(!validarNota && totalDasNotas >= NOTA_MINIMA_PARA_PASSAR){
			System.out.println("Nota atingida português: " + notaPortugues);
			System.out.println("Nota atingida matemática: " + notaMatematica);
			System.out.println("Aprovado.");
		}else{
			System.out.println("Nota atingida português: " + notaPortugues);
			System.out.println("Nota atingida matemática: " + notaMatematica);
			System.out.println("Reprovado.");
		}
		
		
		
		scanner.close();
		
	}

}
