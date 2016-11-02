package CadastroAluno;

public class Aluno extends Pessoa {
	private String curso;
	private String semestre;

	public Aluno(String nome, String endereco, String dataNascimento, String curso, String semestre) {
		super(nome, endereco, dataNascimento);
		this.curso = curso;
		this.semestre = semestre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

}
