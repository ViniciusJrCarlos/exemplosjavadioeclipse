package singleton;

/**
 * usando singleton "pregui�oso"
 * @author vinic
 *
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	//singleton tem que ser privado para ninguem instanciar
	private SingletonLazy() {
		
		super();
	}
	
	public static SingletonLazy getInstancia() {
		
		if(instancia == null) {
			
			instancia = new SingletonLazy();
			
		}
		return instancia;
	}

}
