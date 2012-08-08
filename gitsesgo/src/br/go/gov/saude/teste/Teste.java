package br.go.gov.saude.teste;

import java.io.ObjectInputStream.GetField;

/**
 * Classe de teste.
 * 
 * @author Rodrigo Freitas Melo
 * 
 */
public class Teste {

	String texto = "Hello World!";

	private String processaTextoMaiusculo() {
		return texto.toUpperCase();
	}

	public static void main(String[] args) {
		Teste teste = new Teste();
		System.out.println(teste.processaTextoMaiusculo());
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
