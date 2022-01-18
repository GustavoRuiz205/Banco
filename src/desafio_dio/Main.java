package desafio_dio;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		
		cc.depositar(5300);
		cc.transferir(300, poupanca);
		cc.sacar(220);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
