
public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		Boolean carrinhoMaiorQue100 = false;
		Boolean periodoPromocao = true;
		Boolean jaFezCompraNaLoja = false;
		Boolean pagamentoAvista = true;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoPromocao;
//		
//		if(aplicarDesconto){
//			System.out.println("Sim! Aplique o desconto.");
//		}else{
//			System.out.println("Não! Aplique o desconto.");
//		}
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoPromocao;
//		
//		if(aplicarDesconto){
//			System.out.println("Sim! Aplique o desconto.");
//		}else{
//			System.out.println("Não! Aplique o desconto.");
//		}
		
//		Boolean aplicarDesconto = periodoPromocao && carrinhoMaiorQue100 && jaFezCompraNaLoja;
//		
//		if(aplicarDesconto){
//			System.out.println("Sim! Aplique o desconto.");
//		}else{
//			System.out.println("Não! Aplique o desconto.");
//		}
		
//		Boolean aplicarDesconto = periodoPromocao || carrinhoMaiorQue100 || jaFezCompraNaLoja;
//		
//		if(aplicarDesconto){
//			System.out.println("Sim! Aplique o desconto.");
//		}else{
//			System.out.println("Não! Aplique o desconto.");
//		}
		
		Boolean aplicarDesconto = periodoPromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAvista;
		
		if(aplicarDesconto){
			System.out.println("Sim! Aplique o desconto.");
		}else{
			System.out.println("Não! Aplique o desconto.");
		}
		
	}

}
