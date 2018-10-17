import java.util.Scanner;

//La�o While � quando se tem uma condi��o que precisa ser atingida, qualquer express�o que retorne um valor booleano
public class IteracaoWhile {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		for(int i = 0; i < 10; i++){
			System.out.println("Um texto qualquer.");
		}
		*/
		
		/*
		int i = 0;
		while(i < 10){
			System.out.println("Um texto qualquer.");
			i++;
		}
		*/
		
		//La�o While usando break
		/*
		int i = 0;
		while(i < 10){
			if(i == 5){
				System.out.println("Vai parar!");
				break;
			}
			System.out.println(i + ": Um texto qualquer.");
			i++;
		}
		*/
		
		//La�o While usando continue
		int i = 0;
		while(i < 10){
			if (i == 5) {
				System.out.println("Vai continuar!");
				i++;
				continue;
			}
			System.out.println(i + ": Um texto qualquer.");
			i++;
		}
		
		scanner.close();
		
	}

}
