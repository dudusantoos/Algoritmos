
public class Estacionamento {
	private int numeroVagas;
	private int numeroVagasLivres;

	public Estacionamento(int numeroVagas, int numeroVagasLivres) {
		super();
		this.numeroVagas = numeroVagas;
		this.numeroVagasLivres = numeroVagasLivres;
	}

	public int getNumeroVagas() {
		return numeroVagas;
	}

	public void setNumeroVagas(int numeroVagas) {
		this.numeroVagas = numeroVagas;
	}

	public int getNumeroVagasLivres() {
		return numeroVagasLivres;
	}

	public void setNumeroVagasLivres(int numeroVagasLivres) {
		this.numeroVagasLivres = numeroVagasLivres;
	}

}
