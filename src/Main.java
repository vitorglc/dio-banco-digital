
public class Main {

	public static void main(String[] args) { 
		Banco banco = new Banco("Bradesco");
		Cliente vitor = new Cliente("Vitor");
		banco.adicionarCliente(vitor);
		Conta cc = new ContaCorrente(vitor);
		Conta poupanca = new ContaPoupanca(vitor);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		banco.listarClientes();

		Cliente daniel = new Cliente("Daniel");
		banco.adicionarCliente(daniel);
		Conta cc2 = new ContaCorrente(daniel);
		Conta poupanca2 = new ContaPoupanca(daniel);

		cc2.depositar(100);
		cc2.transferir(100, poupanca2);
		
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();
		banco.listarClientes();
	}

}
