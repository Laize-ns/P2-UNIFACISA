package b�sicos;

import java.util.Scanner;

public class ExercicioCinco {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//programa que receba como entrada 25 n�meros 
		//e exiba a quantidade de n�meros que s�o pares e positivos
		
		int cont = 0;
		
		for(int i = 1; i <= 25; i++) {
			
			System.out.println("Digite o n�mero: ");
			int num = entrada.nextInt();
			
			if(num % 2 == 0 && num > 0) {
				cont += 1;
			}
		}
		
		System.out.println("Quantidade de n�meros pares e positivos: " + cont);
		
		entrada.close();
		
	}
}
