package btp.assis_silva.estoque;

public class Produto {
	private String nome;
	private int quantidade;
	private double preco;
	
	public Produto(String nome2, int qtd, double valor) {
		nome = nome2;
		quantidade = qtd;
		preco = valor;
	}

	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
		
}
