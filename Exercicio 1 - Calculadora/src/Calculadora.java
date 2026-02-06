
public class Calculadora {
	
	public float calcular(float n1, float n2, char operacao) {
		 switch(operacao) {
		 	case '+':
		 		return n1+n2;
		 		
		 	case '-':
		 		return n1-n2;
		 	
		 	case '*':
		 		return n1*n2;
		 	
		 	case '/':
		 		if (n1 == 0 || n2 == 0) {
		 			System.out.println("Não é possivel dividir por 0.");
		 			break;
		 		}else {
		 			return n1/n2;
		 		}
		 		
		 	case '^':
		 		float resultado = n1;
		 		for(int i=1; i<n2; i++) {
		 			resultado *= n1;
		 		}
		 		return resultado;
		 
		 }
		return operacao;
		
		

	}
	
	

}
