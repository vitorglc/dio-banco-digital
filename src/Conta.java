import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected double debito;
	protected List<String> movimentos;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.movimentos = new ArrayList<>();
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
		novoMovimento(valor,"Saque");
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		novoMovimento(valor,"Deposito");

	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		novoMovimento(valor,"Saque para deposito");

	}

	@Override
	public void emprestimo(double valor, int parecelas, Banco banco) {
		banco.sacar(valor);
		this.depositar(valor);
		novoMovimento(valor,"Emprestimo");

	}
	@Override
	public void novoMovimento(double valor, String tipoMovimento){
		this.movimentos.add(tipoMovimento+": "+valor);
	}

	public void imprimirMovimentos(List<String> movimentos){

		for (String m : movimentos) {
			System.out.println(m);
		}
	}
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
