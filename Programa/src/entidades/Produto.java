package entidades;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEmEstoque() {
		return this.preco * this.quantidade;
	
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
		
	}
	
	public String toString() {
		return this.nome + ",$ "
				+ String.format("%.2f", this.preco) + ","
				+ this.quantidade + " unidade,Total: $ "
				+ String.format("%.2f", this.totalValorEmEstoque());
	}
	}
