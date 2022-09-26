package Heranca;

public class ContaSalario extends Conta {

	private int quantidadeDeSaques;

	public ContaSalario(int numero, int agencia, String banco, double saldo, int quantidadeDeSaques) {
		super(numero, agencia, banco, saldo);
		this.quantidadeDeSaques = 3;
	}

	@Override
	public String toString() {
		return super.toString() + " Conta Salario{" +
				"quantidadeSaques=" + quantidadeDeSaques +
				'}';
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public boolean sacar(double quantia) {
		if (quantia > saldo) {
			return false;
		} else {
			if (this.quantidadeDeSaques > 0) {
				this.quantidadeDeSaques--;
				this.saldo -= quantia;
				return true;
			} else {
				System.out.println("Limite de saques excedido");
				return false;
			}
		}
	}

	@Override
	public double depositar(double valor) {
		return 0;
	}
}
