package segundaetapa;

import java.util.Scanner;
/*
 * 6) Crie uma classe que modele um ret�ngulo: Atributos: LadoA, LadoB
 * (ou Comprimento e Largura, ou Base e Altura, a escolher) M�todos: Mudar valor dos lados,
 * Retornar valor dos lados, calcular �rea e calcular Per�metro; Crie um programa que utilize esta classe.
 * Ele deve pedir ao usu�rio que informe as medidas de um local. Depois, deve criar um objeto com as medidas
 * e calcular a quantidade de pisos e de rodap�s necess�rias para o local. 
 * 
 * Classe ProgramaArea com m�todo main().
 */
public class ProgramaArea {

	public static void main(String[] args) {
		double base, altura;
		System.out.printf("Bem vindo ao programa de c�lculo de pisos e rodap�s.\n");
		Scanner scnBase = new Scanner(System.in);
		Scanner scnAltura = new Scanner(System.in);
		System.out.printf("Por favor digite o tamanho da base: ");
		base = scnBase.nextDouble();
		System.out.printf("Por favor digite a altura: ");
		altura = scnAltura.nextDouble();
		Area objArea = new Area(base, altura);
		System.out.printf("Metragem de pisos: %.2fm2 \n", objArea.getArea());
		System.out.printf("Metragem de rodap�s: %.2fmts \n", objArea.getPerimetro());
		System.out.println("Obrigado por ter utilizado esse programa!");		
	}
}
