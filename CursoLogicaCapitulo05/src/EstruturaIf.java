
public class EstruturaIf {
	
	public static void main(String[] args) {
		
		Double emprestimo = 4000.00;
		Double movimentacaoMedia = 2000.00;
		
		//Boolean movimentaPeloMenosMetadoDoValor = (movimentacaoMedia * 2) >= emprestimo;;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
		//Boolean liberarEmprestimo = movimentaPeloMenosMetadoDoValor && aContaTemTempoSuficienteDeAbertura && temNomeLimpo;
		
		if (((movimentacaoMedia * 2) >= emprestimo) && aContaTemTempoSuficienteDeAbertura && temNomeLimpo) {
			System.out.println("Sim! pode liberar o empréstimo.");
		}else{
			System.out.println("Não pode liberar o empréstimo.");
		}
		
	}

}
