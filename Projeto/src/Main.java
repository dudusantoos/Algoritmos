import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("Digite sua idade");

		int idade = new Scanner(System.in).nextInt(); // o sacnner vai pegar o
														// que
														// foi digitado e gravar
														// na
														// variável idade
		boolean MaiorIdade = 18 <= idade; // <= (menor e igual) e não < (menor)
		if (MaiorIdade == false)

		{ // comparação em java de números inteiros é usado por == e não igual.
			// Objetos usam .equals()
			System.out.println("Você é menor de idade!!!");
		} else {

			System.out.println("Parabéns!!!\nVocê ja pode beber!");
		}
	}
}