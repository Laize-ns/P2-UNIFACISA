package b�sicos;

import java.util.Scanner;

public class ExercicioDois {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//programa que recebe do usu�rio 3 valores do tipo ponto flutuante 
		//e imprime na tela a m�dia aritm�tica destes n�meros.
		
		System.out.println("Digite a primeira nota: ");
		float nota1 = entrada.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float nota2 = entrada.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		float nota3 = entrada.nextFloat();
		
		float media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A m�dia �: " + media);
		
		entrada.close();
		

	}

}


