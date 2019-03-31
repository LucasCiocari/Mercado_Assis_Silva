package btp.assis_silva.estoque;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Estoque {
	private ArrayList<Produto> produtos;

	Estoque() {
		produtos = new ArrayList<Produto>();
	}

	public String novo_produto(String nome, int qtd, double valor) {
		if (qtd < 0) {
			return "Err: quantidade muito baixa";
		} else if (qtd > 1000) {
			return "Err: quantidade muito alta";
		}

		if (valor < 0.0) {
			return "Err: valor muito baixo";
		} else if (valor > 99999.99) {
			return "Err: valor muito alto";
		}

		int index = 0;
		boolean use_index = false;
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getNome() == nome) {
				index = i;
				use_index = true;
				break;
			}
		}

		if (use_index) {
			int quantidade_atual = produtos.get(index).getQuantidade();

			if (quantidade_atual + qtd < 1000) {
				produtos.get(index).setQuantidade(quantidade_atual + qtd);
			} else
				return "Err: Sem espaço suficiente de inventário";
		} else {
			produtos.add(new Produto(nome, qtd, valor));
		}
		return "success";
	}

}
