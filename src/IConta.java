import java.util.List;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void emprestimo(double valor, int parcelas, Banco banco);

	void imprimirExtrato();

	void novoMovimento(double valor, String tipoMovimento);

	void imprimirMovimentos(List<String> movimentos);

}
