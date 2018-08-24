package segundaetapa;

import java.util.Scanner;
/*
 * 3) Receba o número de horas trabalhadas por uma pessoa e o valor do salário mínimo
 *  e mostre o salário a receber baseado nas seguintes regras: A hora trabalhada equivale
 *  a 10% do salário mínimo informado; O salário bruto é dado pelo número de horas trabalhadas
 *  multiplicado pelo valor de cada hora; O imposto pago é de 3%.  O salário a receber é equivalente
 *  ao salário bruto subtraído do imposto.
 * 
 */
public class HorasTrabalhadas {
	public static void main(String[] args) {
		double horasTrabalhadas, salarioMin, salarioTotal, valorHora;
		Scanner scnHoras = new Scanner(System.in);
		Scanner scnSalarioMin = new Scanner(System.in);
		System.out.println("Digite horas trabalhadas no mês:");
		horasTrabalhadas = scnHoras.nextDouble();
		System.out.println("Digite valor do salário mínimo:");
		salarioMin = scnSalarioMin.nextDouble();
		valorHora = salarioMin * 0.10;
		salarioTotal = horasTrabalhadas * valorHora;
		System.out.printf("O salário bruto: R$%.2f", salarioTotal);
		System.out.printf("\nSalário líquido: R$%.2f", salarioTotal * 0.97);
		
		
		
	}

}
