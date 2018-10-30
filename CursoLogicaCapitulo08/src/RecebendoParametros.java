import java.util.Scanner;

public class RecebendoParametros {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[]{"Java EE", "Spring", "Java OO Avançado"};
		
		System.out.println("Escolha dentre os cursos abaixo");
		
		iterarEExibirPosicoesDoVetorString(cursos);
		
		System.out.print("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean validaPosicao = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if(!validaPosicao){
			encerrarProgramaPorCausaDePosicaoInvalida();
		}
		
		
		
		String[] formasPagamento = new String[]{"Boleto", "Cartão de Crédito"};
		
		System.out.println("Escolha dentre as formas de pagamento: ");
		
		iterarEExibirPosicoesDoVetorString(formasPagamento);
		
		System.out.print("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		validaPosicao = posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento.length;
		
		if(!validaPosicao){
			encerrarProgramaPorCausaDePosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhido = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e forma de pagamento é " + formaPagamentoEscolhido + ".");
		
		scanner.close();
	}
	
	static void imprimirTraco(){
		System.out.println("------------------------------");
	}
	
	static void encerrarProgramaPorCausaDePosicaoInvalida(){
		System.err.println("Posição inválida!");
		System.exit(1);
	}
	
	static void imprimir(String texto){
		System.out.println(texto);
	}
	
	static void iterarEExibirPosicoesDoVetorString(String[] vetor){
		for(int i = 0; i < vetor.length; i++){
			System.out.println("[" + i + "]" + vetor[i]);
		}
	}
}
