package cursojavavio.tipoVariaveis;

public class tipoVariaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salarioMinimo = 2500;
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;
		String nomeCompleto = "LINGUAGEM " + " JAVA";
		
	
		System.out.println("O salario minimo é: " + salarioMinimo);

		System.out.println("O salario minimo é: " + numeroCurto);

		System.out.println("O salario minimo é: " + numeroNormal);
		

		System.out.println("O salario mminimo é: " + numeroCurto2);

		System.out.println("o nome completo é: " + nomeCompleto);
		
		
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
		
		System.out.println("o resultado é: " + resultado);
		
		// usando operadores de comparação chamamos de operadores relacionais.
		
		int numero1  =  5;
		int numero2  =  5;
		
		boolean simNao = numero1 == numero2;
		
		System.out.println("numeroUm é igual numeroDois " + simNao);
		
		simNao = numero1 != numero2;
		
		System.out.println("numeroUm é diferente numeroDois " + simNao);
		
		simNao = numero1 > numero2;
		
		System.out.println("numeroUm é maior numeroDois " + simNao);
		
		simNao = numero1 < numero2;
		
		System.out.println("numeroUm é igual numeroDois " + simNao);
		
		//simNao = numero1 == numero2;
		
		String nomeUm =  "Vinicius";
		String nomeDois = "vinicius";
		
		System.out.println("Os nomes são iguais ou falsos: ");
		System.out.println(nomeUm == nomeDois);
		
		String nomeTres =  "Vinicius";
		String nomeQuatro = new String("Vinicius");
		
		System.out.println("Os nomes são iguais ou falsos: ");
		System.out.println(nomeTres.equals (nomeQuatro));
		
		
		boolean condicao1 = true;
		boolean condicao2 = true;
		
		if(condicao1 && condicao2) {
			
			System.out.println("as duas condiçoes são verdadeiras? ");
			
		}
			System.out.println(" fim...");
		
		
		
			if(condicao1 || condicao2) {
				
				System.out.println("as duas condiçoes são verdadeiras? ");
				
			}
				System.out.println(" fim...");

	}

}
