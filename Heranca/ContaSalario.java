package Heranca;

public class ContaSalario extends Conta {
	
	private int quantidadeDeSaques;
	
	public ContaSalario(int numero, int agencia, String banco, double saldo, int quantidadeDeSaques) {
		super(numero, agencia, banco, saldo);
		this.quantidadeDeSaques = 3;
	}	
	
	public double getSaldo() {
		return this.saldo;
	}		
	
	public double sacar(double valor) {
		if(quantidadeDeSaques == 0) {
			System.out.println("Voce atingiu a quantidade limite para saques no mes, caso deseje continuar, tera uma cobrança de R$6,00 por saque efetuado.");
		}
		else {
			System.out.println("Voce ainda tem: " + quantidadeDeSaques);System.out.println(" saques disponíveis este mes.");
			this.quantidadeDeSaques--;
			this.saldo -= valor;
		}
		return 0.0;		
	}
	
	public double depositar(double valor) {
		setSaldo(getSaldo() + valor);
		return valor;
	}

	@Override
	public String toString() {
		return "ContaSalario [quantidadeDeSaques=" + quantidadeDeSaques + "]";
	}
	
	
}
