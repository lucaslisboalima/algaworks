import java.util.Scanner;

public class TipoLogico {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		Boolean variavelVerdadeira = true;
		System.out.println("Vari�vel verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Vari�vel falsa: " + variavelFalsa);
		
		System.out.println("--------------------------------------------------");
		
		System.out.printf("Informe sua idade: ");
		Integer idade = scanner.nextInt();
		
		Boolean podeTirarCarteira = idade >= 18;
		
		//System.out.println("Pode tirar carteira " + podeTirarCarteira);
		
		if(podeTirarCarteira){
			System.out.println("Sim! Ele(a) pode tirar a carteira." );
		}else{
			System.out.println("N�o! Ele(a) n�o pode tirar a carteira.");
		}
		
		scanner.close();
		
	}

}
