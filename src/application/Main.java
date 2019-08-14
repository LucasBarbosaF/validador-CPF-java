package application;

import java.util.Scanner;

import validacao.validCPF;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe um CPF: ");
		String CPF = sc.next();
		CPF = CPF.replaceAll("\\.","").replaceAll("\\-", "");

		if (validCPF.isCPF(CPF) == true) {
			System.out.printf("Sucesso, CPF valido");
		}else {
			System.out.printf("Erro, CPF invalido !!!\n");
		}
		
		sc.close();
	}
}
