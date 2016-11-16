
public class Veiculo {
	private String placa;
	private String modelo;
	private String cor;
	private String tipo;

	public Veiculo(String placa, String modelo, String cor, String tipo) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
