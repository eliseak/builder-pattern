package br.com.eliseak;

import br.com.eliseak.model.Sorvete;

public class Main {
	
	public static void main(String[] args) {
		
		String sabor = "baunilha";
		String cobertura = "chocolate";
		
		// Objeto de sorvete instanciado com a classe Builder
		Sorvete sorveteComBuilder = new Sorvete.Builder()
				.cobertura(cobertura)
				.sabor(sabor)
				.build();
		
		System.out.println("Sorvete 1: " + sorveteComBuilder.toString());
		
		// Código equivalente
		Sorvete.Builder builderDeSorvete = new Sorvete.Builder();
		builderDeSorvete = builderDeSorvete.cobertura(cobertura);
		builderDeSorvete = builderDeSorvete.sabor(sabor);
		
		Sorvete sorveteEquivalente = builderDeSorvete.build();
		
		System.out.println("Sorvete 2: " + sorveteEquivalente.toString());

	}
}
