
public class Pessoa extends SerHumano{

	private String nome;
	private String endereco;
	private String rg;
	private String corSapato;

	public Pessoa(String nome, String endereco, String rg, String corSapato) {
	
		this.nome = nome;
		this.endereco = endereco;
		this.rg = rg;
		this.corSapato = corSapato;
	}

	public String getCorSapato() {
		return corSapato;
	}

	public void setCorSapato(String corSapato) {
		this.corSapato = corSapato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
