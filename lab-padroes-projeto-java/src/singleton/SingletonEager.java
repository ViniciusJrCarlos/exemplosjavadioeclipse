package singleton;

/**
 * usando singleton "apressada"
 * @author vinic
 *
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	//singleton eager j� fica instanciado na parte de cima, sem precisar
	//fazer o if verificando se est� nula ou n�o a instancia no return
	private SingletonEager() {
		
		super();
	}
	
	public static SingletonEager getInstancia() {
	
			return instancia;
	
	}

}
