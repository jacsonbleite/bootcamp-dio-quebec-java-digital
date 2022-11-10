package desafio.dio.banco;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	
	@Override
	public void imprimirExtrato() {
		
		System.out.println("******* Extrado Conta Corrente *******");	
		super.imprimirInfosComuns();
		System.out.println("******* ********************** *******");
		
	}	
	
}
