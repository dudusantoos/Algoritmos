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
		
	}

	private static void InserirAlunos() {
		
	}

	private static void ListarAlunos() {
		

	}

	private static int opcaoMenuPrincipal() {
		
		return 0;
	}

}
