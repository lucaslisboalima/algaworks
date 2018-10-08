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
	
	static final Double NOTA_MINIMA_PARA_PASSAR = 150.0;
	static final Double NOTA_CORTE = 60.0;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Informe a nota de português: ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.printf("Informe a nota de matemática: ");
		Double notaMatematica = scanner.nextDouble();
		
		Boolean validarNota = notaPortugues < NOTA_CORTE || notaMatematica < NOTA_CORTE;
		
		Double totalDasNotas = notaPortugues + notaMatematica;
		
		if(!validarNota && totalDasNotas >= NOTA_MINIMA_PARA_PASSAR){
			System.out.println("Parabéns! Você Passou.");
		}else{
			System.out.println("Infelizemente, não foi dessa vez.");
		}
		
		scanner.close();
		
	}

}
