package segundaetapa;
/*
 * 1) Um funcionário de uma empresa recebe, anualmente, aumento salarial.
 * Sabe-se que: Esse funcionário foi contratado em 2005 com salário inicial de R$ 1.000,00;
 * Em 2006 ele recebeu aumento de 1,5% sobre seu salário inicial; e  A partir de 2007, os aumentos
 * salariais sempre corresponderam ao dobro do percentual do ano anterior.  Faça um algoritmo que
 * determine o salário atual deste funcionário. 
 */

public class SalarioFuncionario {
	
	public static void main(String[] args) {
		int salarioInicial=1000;
		double salarioFinal=0;
		int anoInicial=2005;
	    int anoAtual=2018;
	    double porcentagem = 0.015;
	    while (anoInicial <= anoAtual){
	    	if (anoInicial == 2005) {
	    		salarioFinal = salarioInicial;
	    	} else if (anoInicial == 2006) {
	    		salarioFinal = salarioFinal + (salarioFinal * porcentagem);
	    		System.out.printf("Porcentagem aplicada %.1f%%\n", porcentagem * 100);
	    	}else if (anoInicial > 2006) {
	    		porcentagem = (porcentagem * 2);
	    		System.out.printf("Porcentagem aplicada %.1f%%\n", porcentagem * 100);
	    		salarioFinal = salarioFinal + (salarioFinal * porcentagem);
	    	}
	    	System.out.printf("Salário em %d R$%.2f \n", anoInicial, salarioFinal);   	
		    anoInicial++;
	    	}

	}
	

}
