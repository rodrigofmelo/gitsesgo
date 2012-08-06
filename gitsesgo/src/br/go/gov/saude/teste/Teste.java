package br.go.gov.saude.teste;

import java.io.ObjectInputStream.GetField;

/**
 * Classe de teste.
 * 
 * @author Rodrigo Freitas Melo
 *
 */
public class Teste {
	
	String texto = "";
	
	public static void main(String[] args) {
		String txt = "!";
		System.out.println("hello world" + txt);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
