package estruturaCondicional;

import java.util.Scanner;

public class Desafio2703 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero;

		System.out.println("informe o mês");
		numero = ler.nextInt();

		if(numero == 1) {
			System.out.println("Janeiro");
		}
		else if(numero == 2) {
			System.out.println("Fevereiro");
		}
		else if(numero == 3) {
			System.out.println("Março");
		}

		else if(numero == 4) {
			System.out.println("Abril");
		}
		else if(numero == 5) {
			System.out.println("Maio");
		}

		else if(numero == 6) {
			System.out.println("Junho");
		}
		else if(numero == 7) {
			System.out.println("Julho");
		}
		else if(numero == 8) {
			System.out.println("Agosto");
		}
		else if(numero == 9) {
			System.out.println("Setembro");
		}
		else if(numero == 10) {
			System.out.println("Outubro");
		}
		else if(numero == 11) {
			System.out.println("Novembro");
		}
		else if(numero == 12) {
			System.out.println("Dezembro");
		}
		else {
			System.out.println("mês invalido");
		}
		ler.close();
	}
}
