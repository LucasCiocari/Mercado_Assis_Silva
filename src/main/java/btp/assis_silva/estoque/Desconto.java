package btp.assis_silva.estoque;

public class Desconto {
	public double porcentagem(int qtd, double valor) {
		if(valor < 275.00) {
			if(qtd <5) return 0;
			if(qtd <10) return 0.02;
			if(qtd <15) return 0.04;
			return 0.06;
		}
		else
		{
			if(qtd <5) return 0.06;
			if(qtd <10) return 0.06;
			if(qtd <15) return 0.08;
			return 0.1;
		}
	}
}
