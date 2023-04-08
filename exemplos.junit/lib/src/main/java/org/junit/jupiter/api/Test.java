package org.junit.jupiter.api;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;

import exemplos.junit.Pessoa;



public class Test {
	
	@org.junit.Test
	void validarCalculoIdade() {
		
		Pessoa pessoa = new Pessoa( "julia", LocalDate.of( 2020, 1, 1));
		Assertions.assertEquals(expected: 2, pessoa.getIdade());
		
	}


}
