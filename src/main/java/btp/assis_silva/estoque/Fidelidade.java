package btp.assis_silva.estoque;

import java.util.ArrayList;

public class Fidelidade {
	private ArrayList<Cliente> clientes;
	
	Fidelidade()
	{
		clientes = new ArrayList<Cliente>();
	}
	
	public String add_pontos(String cliente, double valor) {
		if(valor > 274.99) {
			int index = 0;
			boolean use_index = false;
			for(int i = 0; i < clientes.size(); i++)
			{
				if(clientes.get(i).getNome() == cliente)
				{
					use_index = true;
					index = i; break;
				}
			}
			
			if(use_index) {
				int novo_pts = clientes.get(index).getQtd_pontos();
				novo_pts += (int)(valor*0.05);
				clientes.get(index).setQtd_pontos(novo_pts);
			}
			else {
				clientes.add(new Cliente(cliente, (int)(valor*0.05)));
			}
		}
		return "Err: valor muito baixo";
	}
}
