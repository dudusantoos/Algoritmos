
public class Aluno extends Pessoa {

	private double nota1;
	private double nota2;

	public Aluno(String nome, String endereco, String rg, String corSapato, double nota1, double nota2) {
		super(nome, endereco, rg, corSapato);
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double calcularMedia() {
		return (nota1 + nota2) / 2;
	}

}
