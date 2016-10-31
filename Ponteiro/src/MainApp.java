import java.util.Date;

public class MainApp {
	public static void main(String[] args) {
		// Cliente c = new Cliente("Claudio");
		Cliente c2 = new Cliente("Eduardo", "123.123.123-55", "Ouro Negro");
		// System.out.println(c.getNome());
		// c.setNome("Pablo");
		// System.out.println(c.getNome());
		// System.out.println(c2.getNome());
		// System.out.println(c2.getCpf());
		// System.out.println(c2.getEmpresa());

		Funcionario f = new Funcionario("Eduardo", new Date(), "Programador");
		System.out.println(f.getNome());
		System.out.println(f.getDataNascimento());
		System.out.println(f.getCargo());
	}
}
