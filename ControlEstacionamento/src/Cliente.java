
public class Cliente extends Pessoa {
	private String formaPagamento;

	public Cliente(String nome, long cpf, String endereco, int telefone, String formaPagamento) {
		super(nome, cpf, endereco, telefone);
		this.formaPagamento = formaPagamento;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

}
