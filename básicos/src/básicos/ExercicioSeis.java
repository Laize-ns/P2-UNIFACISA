package b�sicos;

import java.util.Scanner;

public class ExercicioSeis {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//programa que receba como entrada 50 n�meros 
		//e exiba a soma dos que s�o m�ltiplos de 3.
		
		int cont = 0;
		
		for(int i = 1; i <= 50; i++) {
			
			System.out.println("Digite um n�mero");
			int num = entrada.nextInt();
			
			if(i % 3 == 0) {
				cont += num;
			}
		}
		System.out.println("Soma dos n�meros m�ltiplos de 3: " + cont);
		
		entrada.close();
	}

}


