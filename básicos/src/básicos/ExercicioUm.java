package b�sicos;

import java.util.Scanner;

public class ExercicioUm {
	
	public static void main(String[] args) {
		
				
		Scanner entrada = new Scanner(System.in);
		
		//programa que recebe do usu�rio dois valores do tipo ponto flutuante 
		//e imprime na tela qual dos dois � maior.
				
		System.out.println("Entre com o valor 1: ");
		float valor1 = entrada.nextFloat();
				
		System.out.println("Entre com o valor 2: ");
		float valor2 = entrada.nextFloat();
				
		if(valor1 > valor2) {
		System.out.println("O valor maior �: " + valor1);
		}else {
		System.out.println("O valor maior �: " + valor2);
					
		}
		
		entrada.close();

			
	}

}
