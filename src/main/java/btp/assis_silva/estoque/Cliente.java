package btp.assis_silva.estoque;

public class Cliente {
	private String nome;
	private int qtd_pontos;
	
	Cliente(String nome, int pts){
		this.nome = nome;
		qtd_pontos = pts;
	}	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtd_pontos() {
		return qtd_pontos;
	}
	public void setQtd_pontos(int qtd_pontos) {
		this.qtd_pontos = qtd_pontos;
	}
		
}
