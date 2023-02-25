package curso.javadio.projeto.aluno;

import java.util.Random;
import java.util.Scanner;

import curso.javadio.projeto.aluno.*;

public class CadastrarAluno {

	private String nome;
	private String curso;
	private String endereco;
	private String email;
	private String telefone;
	Random random = new Random();
	private int matricula = random.nextInt(100);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CadastrarAluno aluno = new CadastrarAluno();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Aluno Preencha seu Cadastro");
		System.out.print("Digite seu nome: ");
		aluno.nome = entrada.nextLine();
		
		System.out.print("Digite seu curso: ");
		aluno.curso = entrada.nextLine();
		
		System.out.print("Digite seu endereço: ");
		aluno.endereco = entrada.nextLine();
		
		System.out.print("Digite seu email: ");
		aluno.email = entrada.nextLine();
		
		System.out.print("Digite seu telefone: ");
		aluno.telefone = entrada.nextLine();
		
		System.out.println("encerrando...");
		
		//java.lang.System.exit(1);
		
		System.out.println(" ---------------------- ");
		System.out.println("Seus dados são: ");
		System.out.println("Ola seu nome é: " + aluno.nome);
		System.out.println("Seu ID é: " + aluno.matricula);
		
	}

}
