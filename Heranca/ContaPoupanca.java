package Heranca;

public class ContaPoupanca extends Conta {

	private int diaAniversario;
	private double taxaDeJuros;


	public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros) {
		super(numero, agencia, banco, saldo);
		this.diaAniversario = diaAniversario;
		this.taxaDeJuros = taxaDeJuros;
	}

	public double getSaldo() {
		return this.saldo + this.taxaDeJuros * this.saldo;
	}

	@Override
	public boolean sacar(double quantia) {
		this.saldo -= quantia;
		return true;
	}

	@Override
	public double depositar(double valor) {
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() + " ContaPoupanca{" +
				"diaAniversario=" + diaAniversario +
				", taxaDeJuros=" + taxaDeJuros +
				'}';
	}
}
