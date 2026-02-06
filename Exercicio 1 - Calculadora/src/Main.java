import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Calculadora calculadora = new Calculadora();
		
		boolean continuar = true;
		
		while(continuar) {
			
			try {
			
				System.out.println("Calculadora");
				System.out.println("Digite o primeiro numero: ");
				float n1 = scanner.nextFloat();
				
				System.out.println("Digite a operação(+, -, *, /, ^ ): ");
				char operador = scanner.next().charAt(0);
				
				System.out.println("Digite o segundo numero: ");
				float n2 = scanner.nextFloat();
				
				float resultado = calculadora.calcular(n1, n2, operador);
				
				System.out.println("O resultado da operação é " + resultado);
				
			}catch (InputMismatchException e){
				
				System.out.println("Erro: Por favor, digite apenas numeros!");
				scanner.nextLine();
				continue;
			}
			
			System.out.println("Continuar? s/n");
			char resposta = scanner.next().charAt(0);
			if(resposta == 'n') {
				System.out.println("Programa finalizado.");
				continuar = false;
			}
			
		}
	

	}

}
