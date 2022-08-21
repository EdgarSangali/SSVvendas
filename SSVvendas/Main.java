package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();

		System.out.println("Olá, escolha a opção desejada\n");
		System.out.println("1 - Cadastro de novos produtos");
		System.out.println("2 - Cadastro de novas vendas");
		
		int opcao = sc.nextInt();

		switch (opcao) {

		case 1:
			System.out.println("Bem vindo ao cadastro de novos produtos\n");
			System.out.println("Digite o nome do produto: ");
			Scanner sc1 = new Scanner(System.in);
			produto.produto = sc1.nextLine();
			produto.cadastroProduto(null);
			System.out.println("Digite a quantidade de produtos: ");
			produto.qtde = sc1.nextInt();
			produto.cadastroQtdeProduto(0);
			System.out.println("Saldo Antigo: " + produto.produto + " " + produto.qtdeInicial + " unidades.");
			System.out.println("Novo Saldo = " + produto);			
			break;

		case 2:
			System.out.println("Bem vindo ao cadastro de novss vendas\n");
			System.out.println("Digite o nome do produto: ");
			Scanner sc2 = new Scanner(System.in);
			produto.produto = sc2.nextLine();
			System.out.println("Digite a quantidade de produtos: ");
			produto.qtde = sc2.nextInt();
			System.out.println("Saldo Antigo: " + produto.qtdeInicial + " unidades.");
			produto.reducaoQuantidade(0);		
			System.out.println("Saldo Atual: " + produto.produto + " " + produto.qtdeInicial + " unidades.");
			break;

				
		}

		sc.close();

	}

}
