package curso.javadio.projeto.aluno;

import java.util.Scanner;

public class aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String Scanner;
		

	//public class aluno {
		
		String nome;
		int matricula;
		String curso;
		String endereco;
		String email;
		String telefone;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Aluno Preencha seu Cadastro");
		System.out.print("Digite seu nome: ");
		nome = entrada.nextLine();
		
		System.out.print("Digite seu curso: ");
		curso = entrada.nextLine();
		
		System.out.print("Digite seu endereço: ");
		endereco = entrada.nextLine();
		
		System.out.print("Digite seu email: ");
		email = entrada.nextLine();
		
		System.out.print("Digite seu telefone: ");
		telefone = entrada.nextLine();
		
		System.out.print("encerrando...");
		
		java.lang.System.exit(1);
		
		
		
	//}
		
	}
	

}
