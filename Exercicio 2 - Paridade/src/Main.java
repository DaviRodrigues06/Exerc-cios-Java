
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva um numero para verificar se ele é par ou impar: ");
		int numero = scanner.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("PAR");
		}else {System.out.println("IMPAR");}
		
		
		

	}

}
