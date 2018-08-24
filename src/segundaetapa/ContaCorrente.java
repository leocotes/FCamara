package segundaetapa;
/*
 * 5) Crie uma classe para implementar uma conta corrente. A classe deve possuir os seguintes atributos:
 * n�mero da conta, nome do correntista e saldo. Os m�todos s�o os seguintes: alterarNome, dep�sito e saque;
 * No construtor, saldo � opcional, com valor default zero e os demais atributos s�o obrigat�rios. 
 */

public class ContaCorrente {

	int nConta;
	String nomeCorrentista;
	double saldo;
	
	public ContaCorrente (String nomeCorrentista, int nConta) {
		this.nomeCorrentista = nomeCorrentista;
		this.nConta = nConta;
		saldo = 0;
	}
	public ContaCorrente (String nomeCorrentisa, int nConta, double saldo) {
		this.nomeCorrentista = nomeCorrentisa;
		this.nConta = nConta;
		this.saldo = saldo;
	}
	public void alterarNome(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
		System.out.println("Nome alterado com sucesso!");
	}
	public void setDeposito(double valor) {
		saldo += valor;
		System.out.println("Dep�sito realizado com sucesso!");
		System.out.printf("Seu saldo dispon�vel � de: R$%.2f", saldo);
	}
	public void setSaque(double saque) {
		if (saldo>=saque) {
			saldo -= saque;
			System.out.println("Saque realizado com sucesso!");
			System.out.printf("Seu novo saldo � de: R$%.2f", saldo);
		} else {
			System.out.println("Saldo insuficiente para realizar saque!");
		}
	}
}
