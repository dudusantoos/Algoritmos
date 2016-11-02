package Venda;

public class Vendedor extends Funcionario {
	private String regiaoGeografica;
	private double comissaoVenda;


	public Vendedor(String regiaoGeografica, double comissaoVenda) {
		super(regiaoGeografica, regiaoGeografica, comissaoVenda);
		this.regiaoGeografica = regiaoGeografica;
		this.comissaoVenda = comissaoVenda;
	}

	public String getRegiaoGeografica() {
		return regiaoGeografica;
	}

	public void setRegiaoGeografica(String regiaoGeografica) {
		this.regiaoGeografica = regiaoGeografica;
	}

	public double getComissaoVenda() {
		return comissaoVenda;
	}

	public void setComissaoVenda(double comissaoVenda) {
		this.comissaoVenda = comissaoVenda;
	}

}
