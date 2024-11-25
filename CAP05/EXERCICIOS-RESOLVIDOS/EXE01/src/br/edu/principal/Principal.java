package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat decimalFormatacao = new DecimalFormat("0.00");
		int ano_atual;
		float slrInicial = 1000, novo_salario, percentual;

		System.out.print("Digite o ano atual: ");
		ano_atual = entrada.nextInt();

		percentual = 1.5F / 100;
		novo_salario = slrInicial + percentual * slrInicial;
		
		for (int i = 2007; i <= ano_atual; i++) {
			novo_salario = novo_salario * 2f;
		}

		System.out.println("O novo salário do funcionário é: R$ " + decimalFormatacao.format(novo_salario));
		
		entrada.close();

	}

}
