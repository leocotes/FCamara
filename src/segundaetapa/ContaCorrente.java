package segundaetapa;
/*
 * 5) Crie uma classe para implementar uma conta corrente. A classe deve possuir os seguintes atributos:
 * número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e saque;
 * No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios. 
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
		System.out.println("Depósito realizado com sucesso!");
		System.out.printf("Seu saldo disponível é de: R$%.2f", saldo);
	}
	public void setSaque(double saque) {
		if (saldo>=saque) {
			saldo -= saque;
			System.out.println("Saque realizado com sucesso!");
			System.out.printf("Seu novo saldo é de: R$%.2f", saldo);
		} else {
			System.out.println("Saldo insuficiente para realizar saque!");
		}
	}
}
