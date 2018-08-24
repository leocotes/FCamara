package segundaetapa;

import java.util.Scanner;
/*
 * 2) Elabore um algoritmo para mostrar os números primos existentes em um intervalo.
 * O usuário deverá fornecer os valores inicial (inicial > 0) e final (inicial < final)
 * e os números primos existentes no intervalo ([inicial, final]) devem ser separados por um espaço em branco 
 * Exemplo: Entrada: 2 13 Saída: 2 3 5 7 11 13
 */

public class NumerosPrimos {

	public static void main(String[] args) {
		int num1, num2;
		Scanner primeiroNum = new Scanner(System.in);
		Scanner segundoNum = new Scanner(System.in);
		System.out.println("Digite o primeiro número maior que 0: ");
		num1 = primeiroNum.nextInt();
		System.out.println("Digite o segundo número amior que o primeiro: ");
		num2 = segundoNum.nextInt();
		if ((num1 > 0) && (num1 < num2)) {

			for (int i = num1; i < num2; i++) {
				boolean numPrimo = true;
				for (int j = 2; j <= i; j++) {
					if (((i % j) == 0) && (j != i)) {
						numPrimo = false;
						break;
					}
				}

				if (numPrimo) {
					System.out.printf("%d ", i);
				}
			}

		}else {
	    	System.out.println("Números digitados em ordem incorreta!");
	}
	}
}
