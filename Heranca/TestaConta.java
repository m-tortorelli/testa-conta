package Heranca;

public class TestaConta {

	public static void main(String[] args) {
		Conta contas[] = new Conta[3];

		//Conta corrente oferecendo a opção de retirar da conta salário e adicionar a ela.¹
		ContaCorrente cc = new ContaCorrente(0010, 0001,
				"Banco Generico", 12, 1000);

		ContaPoupanca cp = new ContaPoupanca(0011, 0001,
				"Banco Generico", 1105, 20, 0.05);

		ContaSalario cs = new ContaSalario(0012, 0001,
				"Banco Generico", 1578, 3);
		
		contas[0] = cc;
		contas[1] = cp;
		contas[2] = cs;
		
		cs.sacar(20);
		//conta salário foi retirado o valor abaixo e indica no console, seu restante².
		cs.sacar(1000);
		System.out.println("-------------------------------");

		cc.depositar(1000);
		//conforme exemplo¹
		
		System.out.println("Saldo de contas: ");
		for (Conta conta:contas) {
			System.out.println(conta);
			System.out.println("Saldo atual: R$ " + conta.getSaldo());	
			System.out.println("---------------------------");
		}
	}	

}
