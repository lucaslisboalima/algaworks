import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		
		System.out.println("Escolha dentre os cursos abaixo: ");
		
		for(int i = 0; i < cursos.length; i++){
			System.out.println("[" + i + "]" + cursos[i]);
		}
		
		System.out.print("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean validaPosicao = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if(!validaPosicao){
			encerrarProgramaPorCausaDePosicaoInvalida();
		}
		
		String[] formasDePagamento = new String[]{"Boleto", "Cartão de Crédito"};
		
		System.out.println("Escolha dentre as formas de pagamento: ");
		
		for(int i = 0; i < formasDePagamento.length; i++){
			System.out.println("[" + i + "]" + formasDePagamento[i]);
		}
		
		System.out.print("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		validaPosicao = posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasDePagamento.length;
		
		if(!validaPosicao){
			encerrarProgramaPorCausaDePosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasDePagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida + ".");
		
		scanner.close();
		
	}
	
	static void imprimirTraco(){
		System.out.println("----------------------------------");
	}
	
	static void encerrarProgramaPorCausaDePosicaoInvalida(){
			System.err.println("Posição inválida!");
			System.exit(1);
	}

}
