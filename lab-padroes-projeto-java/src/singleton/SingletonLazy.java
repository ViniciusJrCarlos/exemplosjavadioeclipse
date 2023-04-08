package singleton;

/**
 * usando singleton "preguiçoso"
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
