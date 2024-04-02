package aplicacao;

import java.util.Scanner;
import entidades.Produto;
public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Produto produto = new Produto();
		System.out.println("Entre com a informação de um produto: ");
		System.out.print("Nome: ");
		produto.nome = sc. nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();
		System.out.println();
		System.out.println("Informações do Produto:" + produto); 
		System.out.println();
		System.out.print("Entre com o número de produtos para ser adicionados: ");
		int quantidade = sc.nextInt();
		produto.adicionarProduto(quantidade);
		System.out.println();
		System.out.println("Informações do produto: " + produto);
		System.out.println();
		System.out.print("Entre com o número de produtos para ser removidos: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		System.out.println();
		System.out.println("Informações do Produto: " + produto);sc.close();
		// TODO Auto-generated method stub
	
	}
}
