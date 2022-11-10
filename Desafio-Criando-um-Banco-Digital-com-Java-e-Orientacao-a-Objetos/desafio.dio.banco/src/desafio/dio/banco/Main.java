package desafio.dio.banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente jacson = new Cliente();
		jacson.setNome("Jacson");
		
		Conta corrente = new ContaCorrente(jacson);
		Conta poupanca = new ContaPoupanca(jacson);
		
		corrente.depositar(10.99);
		corrente.transferir(5.00, poupanca);
		
		
		
		corrente.imprimirExtrato();		
		poupanca.imprimirExtrato();

	}

}
