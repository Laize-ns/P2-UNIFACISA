package básicos;

import java.util.Scanner;

public class ExercicioDois {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		float nota1 = entrada.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float nota2 = entrada.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		float nota3 = entrada.nextFloat();
		
		float media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A média é: " + media);
		
		entrada.close();
		

	}

}


