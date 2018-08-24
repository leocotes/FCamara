package segundaetapa;

import java.util.Scanner;
/*
 * 4) Fa�a um programa para uma loja de tintas. O programa dever� pedir o tamanho em metros quadrados da �rea a ser pintada.
 * Considere que a cobertura da tinta � de 1 litro para cada 3 metros quadrados e que a tinta � vendida em latas de 18 litros,
 * que custam R$ 80,00. Informe ao usu�rio a quantidades de latas de tinta a serem compradas e o pre�o total.
 */

public class LojaTintas {
	public static void main(String[] args) {
		int metrosQuadrados, latas, preco;
		Scanner scnMetros = new Scanner(System.in);
		System.out.println("Informe a quantidade e metros quadrados a pintar:");
		metrosQuadrados = scnMetros.nextInt();
		if (metrosQuadrados % 54 == 0) {
			latas = metrosQuadrados / 54;
		} else {
			latas = (metrosQuadrados / 54) + 1;
		}
		preco = latas * 80;
		System.out.printf("Quantidade de latas: %d ", latas);
		System.out.printf("\nValor a pagar: R$%d", preco);
	}
}
