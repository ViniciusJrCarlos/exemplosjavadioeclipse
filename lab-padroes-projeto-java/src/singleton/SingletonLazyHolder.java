package singleton;

/**
 * usando singleton "lazy holder"
 * @author vinic
 *
 */

public class SingletonLazyHolder {
	
	private static class InstanceHolder{
	
	//instancia uma classe encapsulada como detentor da instancia
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {
		
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
	
			return InstanceHolder.instancia;
	
	}

}
