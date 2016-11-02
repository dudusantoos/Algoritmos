package Venda;

import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("----=====VENDEDOR=====-----");
		System.out.println("Digite o nome: ");
		String nome = s.next();
		System.out.println("Digite a data de nascimento: ");
		String dataNascimento = s.next();
		System.out.println("Digite o salário: ");
		double salario = s.nextDouble();
		System.out.println("Digite a região geográfica: ");
		String regiaoGeografica = s.next();
		System.out.println("Digite a comissão: ");
		double comissaoVenda = s.nextDouble();
		
		Vendedor v = new Vendedor(nome, dataNascimento, salario, regiaoGeografica, comissaoVenda);
		System.out.println("O funcionário " + nome +" nascido no dia " + dataNascimento + " como salário " + salario);
		
		
	}

}
