package test;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import exemplos.junit.Pessoa;

public class PessoaTest {
	
	@Test
	void validarCalculoIdade() {
		
		Pessoa pessoa = new Pessoa(nome: "julia", LocalDate.of(year: 2020, month: 1, dayOfMonth: 1));
		
	}

}
