package b�sicos;

import java.util.Scanner;

public class ExercicioSete {
	
public static void main(String[] args) {
		
		
	Scanner entrada = new Scanner(System.in);
		
	//programa que receba como entrada v�rios n�meros, at� que seja informado o valor 100, 
	//e exiba a m�dia dos n�meros pares
		
	int num = 0;
	int cont = 0;
	int soma = 0;
		
	while(num != 100) {
		System.out.println("Entre com um n�mero: ");
		num = entrada.nextInt();
		if(num % 2 == 0 &&  num != 0 && num != 100) {
			soma += num;
			cont += 1;
				
		}
			
		}if(cont == 0) {
			System.out.println("0");
		}else {
			double media = soma / cont;
			System.out.println("A m�dia � : " + media);
			
		entrada.close();

		}
	}
}

