public class Main {

	public static void main(String[] args) {
		Cliente Wesley = new Cliente();
		Wesley.setNome("Wesley");
		
		Conta cc = new ContaCorrente(Wesley);
		Conta poupanca = new ContaPoupanca(Wesley);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
