package subsistema2.cep;

public class CepApi {
	
	//com singleton
	
	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		
		super();
	}
	
	public static CepApi getInstancia() {
		
		return instancia;
		
	}
	
	public String recuperarCidade(String cep) {
		
		return "Poá";
	}
	
	public String recuperarEstado(String cep) {
		
		return "São Paulo";
	}

}
