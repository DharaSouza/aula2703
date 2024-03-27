package estruturaCondicional;

import java.util.Scanner;

public class exemplo2703 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Informe um valor: ");
		numero = ler.nextInt();
		
		if (numero > 0) {
			System.out.println("O valor é positivo");
		}
		else if (numero == 0) {
			System.out.println("O valor é 0");
		}
		else {
			System.out.println("O valor é negativo");
		}

		ler.close();
	}
}
