package aplicacao;

import xadrez.ElementoXadrez;

public class UI {
	
	public static void mostraTabuleiro(ElementoXadrez[][] elementoXadrez) {
		for (int i=0; i<elementoXadrez.length; i++) {
			System.out.print((8-i)+" ");
			for (int j=0; j<elementoXadrez.length; j++) {
				mostraElemento(elementoXadrez[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}

	private static void mostraElemento(ElementoXadrez elemento) {
		if (elemento == null) {
			System.out.print("-");
		} else {
			System.out.print(elemento);
		}
		System.out.print(" ");
	}
}
