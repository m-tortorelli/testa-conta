package Heranca;


public class ContaCorrente extends Conta{
	private double chequeEspecial;
	
	public ContaCorrente(int numero, int agencia, String nome, double saldo, double chequeEspecial) {
		super(numero, agencia, nome, saldo);
		this.chequeEspecial = chequeEspecial;
	}
	
	public String toString() {
		return "Cheque especial: R$ " + this.chequeEspecial;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public double sacar(double valor) {
		System.out.println("Valor do saque: R$ " + valor);
		if(valor <= (getSaldo() + chequeEspecial)) {
			setSaldo(getSaldo() - valor);
			System.out.println("Saldo atual: " + getSaldo());
			
			if(getSaldo() < 0) {
				System.out.println("Valor restante do cheque especial: R$ " + getChequeEspecial());
			}
			return valor;		
		}else {
			System.out.println("Você nao possui saldo disponivel para o saue do cheque especial. Valor atual: R$ " + chequeEspecial);
		}
		return 0.0;
	}
	@Override
	public double depositar(double valor) {
		System.out.println("Valor do deposito: R$ " + valor);
		setSaldo(getSaldo() + valor);
		System.out.println("Saldo atual R$ " + getSaldo());
		return valor;
	}
	
	private double getChequeEspecial() {
		if(getSaldo() < 0) {
			return chequeEspecial - Math.abs(getSaldo());
		} else {
			return chequeEspecial;
		}
	}
	
}
