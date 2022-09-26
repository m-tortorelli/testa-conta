package Heranca;


public class ContaCorrente extends Conta{
	private double chequeEspecial;
	
	public ContaCorrente(int numero, int agencia, String nome, double saldo, double chequeEspecial) {
		super(numero, agencia, nome, saldo);
		this.chequeEspecial = chequeEspecial;
	}
	
	public String toString() {
		return super.toString() + " ContaCorrente{" +
				"chequeEspecial="
				+chequeEspecial + '}';

	}
	
	public double getSaldo() {
		return this.saldo + this.chequeEspecial;
	}
	
	@Override
	public boolean sacar(double quantia) {
		double disponivel = this.chequeEspecial + this.saldo;
		if (quantia > disponivel){
			System.out.println("Voce não tem limite disponivel");
			return false;
		}
		else{
			this.saldo-=quantia;
			return true;
		}
	}

	@Override
	public double depositar(double valor) {
		return 0;
	}


	}
