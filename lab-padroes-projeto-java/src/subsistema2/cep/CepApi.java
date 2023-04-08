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
		
		return "Po�";
	}
	
	public String recuperarEstado(String cep) {
		
		return "S�o Paulo";
	}

}
