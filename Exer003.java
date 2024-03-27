package estruturaCondicional;

import java.util.Scanner;

public class Exer003 {
	
	public static void main(String[] args) {

	Scanner dh = new Scanner (System.in);

	double saque, saldo;
	long cpfc, cpfd, senhac, senhad;
	
	saldo = 10000;
	cpfc = 123456789;
	senhac = 1234;
	
	System.out.print("Qual seu CPF: ");
	cpfd = dh.nextLong();
	
	System.out.print("Qual sua senha: ");
	senhad = dh.nextLong();
	
	if (cpfc == cpfd && senhac == senhad) {
		System.out.println(" ");
		System.out.println("ACESSO PERMITIDO");
		System.out.println("Saldo: R$"+saldo);
		System.out.println(" ");
		System.out.print("Informe o valor do saque desejado: ");
		saque = dh.nextDouble();
		
		if (saque > saldo) {
			System.out.println("Saldo insuficiente");
		}
		else if (saque <= saldo) {
			System.out.println("PROCESSANDO...");
			System.out.println(" ");
			System.out.println("Saque efetuado");
			saldo = saldo-saque;
			System.out.println("Saldo atual de: R$"+saldo);
			}
		}
	
	
	
	
	else if (cpfc != cpfd || senhac != senhad) {
		System.out.println(" ");
		System.out.println("ACESSO NEGADO");
	}
		
		
		
		
	}
}