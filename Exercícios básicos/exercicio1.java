package github.java;

import java.util.Scanner;

public class Basicos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o valor 1: ");
		float valor1 = entrada.nextFloat();
		
		System.out.println("Entre com o valor 2: ");
		float valor2 = entrada.nextFloat();
		
		if(valor1 > valor2) {
			System.out.println("O valor maior é: " + valor1);
		}else {
			System.out.println("O valor maior é: " + valor2);
			
		}

	}

}
