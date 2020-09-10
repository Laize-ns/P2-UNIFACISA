package b�sicos;

import java.util.Scanner;

public class ExercicioTres {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//programa que recebe do usu�rio o nome do produto, e seu pre�o. Se o pre�o for:

//]0, 100[: d� 5% de desconto
//[100,500[: d� 10% de desconto
//[500, inf[: d� 15% de desconto 
		
		//Ao final, seu programa deve imprimir o nome do produto e pre�o com desconto.
		
		System.out.println("Digite o nome do produto: ");
		String produto = entrada.next();
		
		System.out.println("Digite o pre�o do produto: ");
		double preco = entrada.nextDouble();
		
		if(preco > 0 && preco < 100) {
			preco *= 0.95;
		}else if(preco >= 100 && preco < 500) {
			preco *= 0.90;
		}else {
			preco *= 0.85;
		}
		
		System.out.println(produto + "R$" + preco);
		
		entrada.close();

	}

}


