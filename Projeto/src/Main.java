import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("Digite sua idade");

		int idade = new Scanner(System.in).nextInt(); // o sacnner vai pegar o
														// que
														// foi digitado e gravar
														// na
														// vari�vel idade
		boolean MaiorIdade = 18 <= idade; // <= (menor e igual) e n�o < (menor)
		if (MaiorIdade == false)

		{ // compara��o em java de n�meros inteiros � usado por == e n�o igual.
			// Objetos usam .equals()
			System.out.println("Voc� � menor de idade!!!");
		} else {

			System.out.println("Parab�ns!!!\nVoc� ja pode beber!");
		}
	}
}