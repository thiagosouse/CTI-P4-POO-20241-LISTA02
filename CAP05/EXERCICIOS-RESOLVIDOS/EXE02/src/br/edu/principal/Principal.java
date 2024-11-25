package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n, e,i,j,fat;
		
		
	
		System.out.println("\nFórmula: E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!");
		System.out.println("Digite um valor de N: ");
		n = entrada.nextInt();
	
		e = 1;

		for (i = 1; i <= n; i++) 
		{
			fat = 1;
			
			for (j = 1; j <= i; j++) {
				fat = fat * j;
			}
			e = e + 1 / fat;
		}
		System.out.println("\nConforme a fórmula, o valor de E é " + e + "\n");

	}

}