package segundaetapa;

import java.util.Scanner;
/*
 * 3) Receba o n�mero de horas trabalhadas por uma pessoa e o valor do sal�rio m�nimo
 *  e mostre o sal�rio a receber baseado nas seguintes regras: A hora trabalhada equivale
 *  a 10% do sal�rio m�nimo informado; O sal�rio bruto � dado pelo n�mero de horas trabalhadas
 *  multiplicado pelo valor de cada hora; O imposto pago � de 3%.  O sal�rio a receber � equivalente
 *  ao sal�rio bruto subtra�do do imposto.
 * 
 */
public class HorasTrabalhadas {
	public static void main(String[] args) {
		double horasTrabalhadas, salarioMin, salarioTotal, valorHora;
		Scanner scnHoras = new Scanner(System.in);
		Scanner scnSalarioMin = new Scanner(System.in);
		System.out.println("Digite horas trabalhadas no m�s:");
		horasTrabalhadas = scnHoras.nextDouble();
		System.out.println("Digite valor do sal�rio m�nimo:");
		salarioMin = scnSalarioMin.nextDouble();
		valorHora = salarioMin * 0.10;
		salarioTotal = horasTrabalhadas * valorHora;
		System.out.printf("O sal�rio bruto: R$%.2f", salarioTotal);
		System.out.printf("\nSal�rio l�quido: R$%.2f", salarioTotal * 0.97);
		
		
		
	}

}
