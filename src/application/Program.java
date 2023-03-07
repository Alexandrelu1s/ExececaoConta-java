package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import Exception.MinhaExcecao;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Numero da conta: ");
			int num = sc.nextInt();	
			
			System.out.print("Titular da conta: ");
			sc.nextLine();
			String titular = sc.nextLine();
			
			System.out.print("Deposito inicial: ");
			Double depositoInicial = sc.nextDouble();
			
			System.out.print("Limite do saque: ");
			Double limite = sc.nextDouble();
			
			Conta conta = new Conta(num, titular, limite, depositoInicial);
			
			System.out.println(conta);
			
			System.out.print("Valor do saque: ");
			Double saque = sc.nextDouble();
			
			conta.saque(saque);
			
		}
		catch(MinhaExcecao e) {
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("Erro de entrada");
		}
		
		sc.close();
	}

}
