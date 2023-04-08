package curso.javadio.equalshashcode;

import java.util.ArrayList;

import java.util.List;
import java.awt.*;
import java.io.OutputStream;

public class Main {

	private String marca;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Carro> listaCarros = new ArrayList<>();
		
		listaCarros.add(new Carro("ford"));
		
		
		
		//listaCarros.add(new Carro( marca: "KYA"));
		
		//listaCarros.add(new Carro( marca: "VOLKS"));
		
		System.out.println(listaCarros.contains(new Carro( "Ford")));

	}

}
