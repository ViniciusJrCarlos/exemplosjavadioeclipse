package cursojavavio.tipoVariaveis;

public class tipoVariaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salarioMinimo = 2500;
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;
		String nomeCompleto = "LINGUAGEM " + " JAVA";
		
	
		System.out.println("O salario minimo �: " + salarioMinimo);

		System.out.println("O salario minimo �: " + numeroCurto);

		System.out.println("O salario minimo �: " + numeroNormal);
		

		System.out.println("O salario mminimo �: " + numeroCurto2);

		System.out.println("o nome completo �: " + nomeCompleto);
		
		
		int a, b;
		
		a = 6;
		b = 6;
		
		//String resultado = "";
		
		//operador ternario poderia ser usado para comparacao e usar para trazer resultado true ou false
		
		String resultado = a == b ? "verdadeiro" : "falso";
		
		/*
		if(a==b)
			
			resultado = "verdadeiro";
			
			else
				
			resultado = "falso";
		*/
		
		System.out.println("o resultado �: " + resultado);
		
		// usando operadores de compara��o chamamos de operadores relacionais.
		
		int numero1  =  5;
		int numero2  =  5;
		
		boolean simNao = numero1 == numero2;
		
		System.out.println("numeroUm � igual numeroDois " + simNao);
		
		simNao = numero1 != numero2;
		
		System.out.println("numeroUm � diferente numeroDois " + simNao);
		
		simNao = numero1 > numero2;
		
		System.out.println("numeroUm � maior numeroDois " + simNao);
		
		simNao = numero1 < numero2;
		
		System.out.println("numeroUm � igual numeroDois " + simNao);
		
		//simNao = numero1 == numero2;
		
		String nomeUm =  "Vinicius";
		String nomeDois = "vinicius";
		
		System.out.println("Os nomes s�o iguais ou falsos: ");
		System.out.println(nomeUm == nomeDois);
		
		String nomeTres =  "Vinicius";
		String nomeQuatro = new String("Vinicius");
		
		System.out.println("Os nomes s�o iguais ou falsos: ");
		System.out.println(nomeTres.equals (nomeQuatro));
		
		
		boolean condicao1 = true;
		boolean condicao2 = true;
		
		if(condicao1 && condicao2) {
			
			System.out.println("as duas condi�oes s�o verdadeiras? ");
			
		}
			System.out.println(" fim...");
		
		
		
			if(condicao1 || condicao2) {
				
				System.out.println("as duas condi�oes s�o verdadeiras? ");
				
			}
				System.out.println(" fim...");

	}

}
