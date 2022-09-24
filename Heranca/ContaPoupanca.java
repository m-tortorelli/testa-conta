package Heranca;

public class ContaPoupanca extends Conta{
	
	private int diaAniversario;
	private double taxaDeJuros;	
	
	
	public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros) {
		super(numero, agencia, banco, saldo);
		this.diaAniversario = diaAniversario;
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public double getSaldo() {
		return this.saldo = this.saldo + this.saldo * taxaDeJuros;			
	}
	
	public double sacar(double valor) {
		setSaldo(getSaldo() - valor);
		return valor;
	}
	
	public double depositar(double valor) {
		setSaldo(getSaldo() + valor);
		return valor;
	}

	@Override
	public String toString() {
		return super.toString() + " ContaPoupanca [diaAniversario=" + diaAniversario + ", taxaDeJuros=" + taxaDeJuros + "]";
	}		

}
