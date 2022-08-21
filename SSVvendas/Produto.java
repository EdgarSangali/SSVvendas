package entities;

public class Produto {

	public String produto;
	public int qtde, qtdeInicial=3;
	
		
	
	public String itensEstoque() {
		return produto;
	}
	
	public void cadastroQtdeProduto(int quantidade) {
		qtde += qtdeInicial;
	}
	
	public void cadastroProduto(String produto) {
		produto += produto;		
	}
	
	
	public void reducaoQuantidade(int quantidade) {
		qtdeInicial -= qtde;
	}
	
	
	public String toString() {
		return produto
				+ " : "
				+qtde
				+" unidades.";
		
	}
	
	
}
