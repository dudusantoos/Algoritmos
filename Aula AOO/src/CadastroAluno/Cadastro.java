package CadastroAluno;

public class Cadastro {
	public static int opcao;
	public static Aluno[] listaA;

	public static void main(String[] args) {

		listaA = new Aluno[10];
		do {
			opcao = opcaoMenuPrincipal();
			switch (opcao) {

			case 1:
				ListarAlunos();
				break;
			case 2:
				InserirAlunos();
				break;
			case 3:
				LocalizarAlunos();
				break;
			default:
				System.out.println("Opção inválida");
			}
		} while (opcao != -1);
		System.out.println("FIM");
	}

	private static void LocalizarAlunos() {
		// TODO Auto-generated method stub

	}

	private static void InserirAlunos() {
		// TODO Auto-generated method stub

	}

	private static void ListarAlunos() {
		// TODO Auto-generated method stub

	}

	private static int opcaoMenuPrincipal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
