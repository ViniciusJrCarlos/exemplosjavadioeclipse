package facede;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facede {
	
	//seja a interface simples 
	
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().recuperarEstado(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}

}
