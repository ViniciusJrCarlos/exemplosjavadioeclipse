package cursojavadio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		double divisao = divisao(a,b);
		int multiplicacao  = multiplicacao(a,b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		
		
	}
		public static int soma(int a, int b) {
			
			return a + b;
			
		}
		
		public static int subtracao(int a, int b) {
			
			return a - b;
			
		}
		
		public static double divisao(double a, double b) {
			
			return a / b;
			
		}
		
		public static int multiplicacao(int a, int b) {
			
			return a * b;
			
		}
		
	}


