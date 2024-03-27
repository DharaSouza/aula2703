package estruturaCondicional;

import java.util.Scanner;

public class exemplo02 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		int v1, v2, v3;

		System.out.println("informe a medida do primeiro lado: ");

		v1= ler.nextInt();

		System.out.println("informe a medida do segundo lado: ");

		v2= ler.nextInt();

		System.out.println("informe a medida do terceiro lado: ");

		v3= ler.nextInt();

		if (v1 == v2 && v2 == v3) {

		System.out.println("O triângulo é equilátero.");

		}
		
		else if (v1 == v2 || v1 == v3 || v2 == v3) {

		System.out.println("O triângulo é isósceles.");

		}

		else {

		System.out.println("O triângulo é escaleno.");

		}

		ler.close();

		}

		}


