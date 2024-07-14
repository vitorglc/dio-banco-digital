
public class Cliente {

	private String nome;
	private String telefone;
	private String endereco;
	private int idade;
	private char sexo;
	
	public Cliente(String nome, String telefone, String endereco, int idade, char sexo) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.idade = idade;
		this.sexo = sexo;
	}

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
