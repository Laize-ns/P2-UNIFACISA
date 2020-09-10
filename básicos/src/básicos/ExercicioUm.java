package básicos;

import java.util.Scanner;

public class ExercicioUm {
	
	public static void main(String[] args) {
		
				
		Scanner entrada = new Scanner(System.in);
		
		//programa que recebe do usuário dois valores do tipo ponto flutuante 
		//e imprime na tela qual dos dois é maior.
				
		System.out.println("Entre com o valor 1: ");
		float valor1 = entrada.nextFloat();
				
		System.out.println("Entre com o valor 2: ");
		float valor2 = entrada.nextFloat();
				
		if(valor1 > valor2) {
		System.out.println("O valor maior é: " + valor1);
		}else {
		System.out.println("O valor maior é: " + valor2);
					
		}
		
		entrada.close();

			
	}

}
