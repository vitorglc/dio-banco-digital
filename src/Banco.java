import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;
	private double saldo;
	private List<Cliente> clientes;
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
		this.saldo = 100000;
		this.clientes = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void sacar(double valor) {
		saldo -= valor;
	}

	
	public void depositar(double valor) {
		saldo += valor;
	}
	public void adicionarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public void listarClientes(){
		System.out.println("=== Lista de clientes ===");
		for (Cliente c : this.clientes) {
			System.out.println(c.getNome());
		}
	}
	}
