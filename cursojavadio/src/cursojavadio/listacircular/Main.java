package cursojavadio.listacircular;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		listacircular<String> minhaListaCircular = new listacircular<>();
		
		minhaListaCircular.add("C0");
		System.out.println(minhaListaCircular);
		
		minhaListaCircular.remove(0);
		System.out.println(minhaListaCircular);
		
		
		minhaListaCircular.add("C1");
		System.out.println(minhaListaCircular);
		
		minhaListaCircular.add("C2");
		minhaListaCircular.add("C3");
		System.out.println(minhaListaCircular);
		
		

	}

}
